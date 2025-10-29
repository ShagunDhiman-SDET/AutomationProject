package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        // launch the browser
        WebDriver driver = new ChromeDriver();
        //manage method for maximize window
        driver.manage().window().maximize();
        // launching the application
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);
        // close is used to close parent window
        driver.findElement(By.linkText("Open a popup window")).click();
        Thread.sleep(3000);
        //close is used to close the parent window
       driver.close();
        // quit is used to close the parent window or child window
       // driver.quit();


    }
}
