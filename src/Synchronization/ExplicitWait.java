package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.shoppersstack.com/products_page/27");

        // pass the value inside check delivery
        driver.findElement(By.id("Check Delivery")).sendKeys("132103");

        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
        wait.pollingEvery(Duration.ofSeconds(2));


        //fluent wait     
        FluentWait w = new FluentWait(driver);
        w.withTimeout(Duration.ofSeconds(20));
        w.pollingEvery(Duration.ofSeconds(5));
        w.ignoring(TimeoutException.class);
        w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

        // for button click
        driver.findElement(By.id("Check")).click();

    }
}
