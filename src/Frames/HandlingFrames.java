package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFrames {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");

        /**
         * driver.switchTo().frame(int index)
         * driver.switchTo().frame(String id or name attribute value)
         * driver.switchTo().frame(WebElement element)
         */

        Thread.sleep(5000);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));

        driver.findElement(By.id("username")).sendKeys("jhgfd");

        /**
         * if u want to jump to the parent frame
         * driver.switchTo().parentFrame()
         */
        driver.switchTo().parentFrame();

    }
}
