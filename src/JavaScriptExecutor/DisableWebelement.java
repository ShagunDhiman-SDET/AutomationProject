package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableWebelement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");

        WebElement disabledTextField = driver.findElement(By.id("tb2"));

        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        j.executeScript("arguments[0].scrollIntoView(true)",disabledTextField);
        Thread.sleep(2000);
        j.executeScript("arguments[0].value='Aman singh'",disabledTextField);


    }
}
