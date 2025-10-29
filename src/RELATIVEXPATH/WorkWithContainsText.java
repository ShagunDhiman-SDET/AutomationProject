package RELATIVEXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithContainsText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");


        Thread.sleep(2000);
        WebElement search = driver.findElement(By.className("desktop-searchBar"));
        search.sendKeys("Jeans", Keys.ENTER);


        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@title='United Colors of Benetton Boys Slim Fit High-Rise Stretchable Jeans']")).click();


    }
}
