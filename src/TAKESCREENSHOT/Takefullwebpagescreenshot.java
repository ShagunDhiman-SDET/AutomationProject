package TAKESCREENSHOT;


import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class Takefullwebpagescreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");
        Thread.sleep(5000);

        TakesScreenshot t = (TakesScreenshot) driver;
        File src = t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshot/pt.png");
        Files.copy(src,dest);



    }
}
