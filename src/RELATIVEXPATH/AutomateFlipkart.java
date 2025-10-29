package RELATIVEXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class AutomateFlipkart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = s.nextLine();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        WebElement search=  driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
        search.sendKeys(productName, Keys.ENTER);

    }
}
