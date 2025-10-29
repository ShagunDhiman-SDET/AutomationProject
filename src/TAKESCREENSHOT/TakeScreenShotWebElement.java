package TAKESCREENSHOT;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotWebElement {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swiggy.com");
        Thread.sleep(5000);
        WebElement pastry = driver.findElement(By.xpath("//img[contains(@src,'Pastry.png')]"));
        File src = pastry.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshot/pastry.png");
       Files.copy(src,dest);
    }
}
