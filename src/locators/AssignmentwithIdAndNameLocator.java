package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentwithIdAndNameLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/register");

        Thread.sleep(1000);

        WebElement radiogender = driver.findElement(By.id("gender-male"));
        radiogender.click();

        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.id("FirstName"));
        firstname.sendKeys("Shagun ");

        Thread.sleep(2000);
        WebElement lastname = driver.findElement(By.id("LastName"));
        lastname.sendKeys(" Dhiman");


        Thread.sleep(2000);

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("shagundhiman999999999@gmail.com");

        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("shagundhiman@123");


        Thread.sleep(2000);
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("shagundhiman@123");

        Thread.sleep(2000);
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();

    }
}
