package RELATIVEXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class AutomatePuma {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product name");
        String productName = s.nextLine();
        driver.manage().window().maximize();
        driver.get("https://in.puma.com/");
        WebElement search=  driver.findElement(By.xpath("(//div[text()='Search'])[1]"));
        search.sendKeys(productName, Keys.ENTER);
    }
}
