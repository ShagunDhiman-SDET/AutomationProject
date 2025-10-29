package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFacebookCreateNewAccount {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);


        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();

        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Shagun");
        Thread.sleep(5000);


        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Dhiman");
        Thread.sleep(5000);

        WebElement birthday_day = driver.findElement(By.name("birthday_day"));
        birthday_day.sendKeys("23");
        Thread.sleep(5000);

        WebElement birthday_month = driver.findElement(By.name("birthday_month"));
        birthday_month.sendKeys("June");
        Thread.sleep(5000);

        WebElement birthday_year = driver.findElement(By.name("birthday_year"));
        birthday_year.sendKeys("1999");
        Thread.sleep(5000);

        WebElement gender = driver.findElement(By.name("sex"));
        gender.click();
        Thread.sleep(5000);

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("shagundhiman66@gmail.com");
        Thread.sleep(5000);

        WebElement password_input = driver.findElement(By.id("password_step_input"));
        password_input.sendKeys("shagun@420");
        Thread.sleep(5000);

        WebElement WebSubmit = driver.findElement(By.name("websubmit"));
        WebSubmit.click();



    }

}
