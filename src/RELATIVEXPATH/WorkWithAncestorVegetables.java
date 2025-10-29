package RELATIVEXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithAncestorVegetables {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://blinkit.com/");

        driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("vegetables");

        Thread.sleep(10000);

//        driver.findElement(By.xpath("//div[text()='Lady Finger (Bhindi)']/ancestor::div[@class='tw-flex tw-w-full tw-flex-col']/descendant::div[text()='ADD']")).click();

        driver.findElement(By.xpath("//div[text()='Orange Carrot (Gajar)']/ancestor::div[@class='tw-flex tw-w-full tw-flex-col']/descendant::div[text()='ADD']")).click();

    }

    }