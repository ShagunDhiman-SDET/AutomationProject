package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
       // id(String id Attribute Value)
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("shagundhiman66@gmail.com");


        // id(String id Attribute Value)
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("shagundhiman@123");

        //name(String name Attribute Value)
        WebElement loginButton= driver.findElement(By.name("login"));
        loginButton.click();



    }
}
