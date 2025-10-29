package HandlingMultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.flipkart.com");

        driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);

        driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']")).click();

        /**
         * The new tab or new window is considered as child window or child popup
         * By defalut the driver control is present on the parent webpage if u want
         *  to  access the elements of child window then u have to switch the
         *  control from parent window to child window.
         */


        //if u want to switch the driver control from one window to another window
        //driver.switchTo().window()

        //if u want to get the session id
        /**
         * 1.getWindowHandle(): http://1.it will give u the parent window session id
         * 2.return type is String
         * 2.getWindowHandles():1.it will give u the parent as well as child window session
         * id
         * return type is Set<String>
         */


        String parent=driver.getWindowHandle();
        Set<String> allId=driver.getWindowHandles();

        for(String id:allId)
        {
            driver.switchTo().window(id);
            if(driver.getTitle().equals("Apple iPhone 16 (Black, 128 GB)"))
                break;
        }
        driver.findElement(By.xpath("//button[text()='Buy Now']")).click();

        driver.switchTo().window(parent);

        driver.findElement(By.xpath("//span[text()='Cart']")).click();
    }



}

