package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUploadBySendKeys {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");

        WebElement fileUpload = driver.findElement(By.id("resume"));
        fileUpload.sendKeys("C:\\Users\\SHAGUN\\Downloads\\Shagun_Dhiman_Testing_CV.pdf");
    }
}
