package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebelement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement hidden = driver.findElement(By.name("custom_gender"));

        JavascriptExecutor j = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        j.executeScript("arguments[0].value='Aman singh'",hidden);
    }
}
