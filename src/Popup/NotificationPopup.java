package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class NotificationPopup {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions c = new ChromeOptions();
        c.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(c);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
        Thread.sleep(3000);
        driver.findElement(By.id("browNotButton")).click();


    }
}
