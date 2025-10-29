package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("shagundhiman12525@gmail.com");

        Thread.sleep(1000);
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("shagundhiman@123");

        WebElement checkremember = driver.findElement(By.id("RememberMe"));
        checkremember.click();

        WebElement forgotpassword = driver.findElement(By.id("RememberMe"));
        forgotpassword.click();

        WebElement checklogin = driver.findElement(By.id("Log in"));
        checklogin.click();


    }
}
