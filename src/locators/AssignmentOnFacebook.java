package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFacebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);

        WebElement mail = driver.findElement(By.id("email"));
        mail.sendKeys("shagundhiman9999999@gmail.com");


        Thread.sleep(2000);
        WebElement id = driver.findElement(By.id("pass"));
        id.sendKeys("Shagun@123 ");

        Thread.sleep(2000);
        WebElement buttonLogin = driver.findElement(By.name("login"));
        buttonLogin.click();

        WebElement registerLink = driver.findElement(By.linkText("Forgotten password?"));
        registerLink.click();

        WebElement buttonCreate = driver.findElement(By.name("Create new account"));
        buttonCreate.click();

    }
}
