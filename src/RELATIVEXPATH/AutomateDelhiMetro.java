package RELATIVEXPATH;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AutomateDelhiMetro {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://delhimetrorail.com/");

        driver.findElement(By.id("buttonDismiss1")).click();

        driver.findElement(By.id("FromStation")).click();


        driver.findElement(By.xpath("//div[text() = 'NOIDA ELECTRONIC CITY']")).click();


        driver.findElement(By.xpath("//font[text() = 'DWARKA SECTOR - 12']")).click();


        driver.findElement(By.id("ToStation")).click();


        driver.findElement(By.xpath("//div[text() = 'MILLENNIUM CITY CENTRE GURUGRAM']")).click();


        driver.findElement(By.xpath("//font[text() = 'SIKANDERPUR']")).click();


        driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();




        for (int i = 0; i <= 4; i++) {
            driver.findElement(By.xpath("//li[text()='+']")).click();
            Thread.sleep(4000);
        }

    }

}




