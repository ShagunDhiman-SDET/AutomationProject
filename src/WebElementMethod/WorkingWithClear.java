package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClear {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement emailTextField  = driver.findElement(By.id("email"));
        System.out.println(emailTextField.getTagName());
        Thread.sleep(2000);
        emailTextField.sendKeys("7807335055");
        Thread.sleep(2000);
        emailTextField.clear();
        Thread.sleep(2000);
        emailTextField.sendKeys("1234567895");

        WebElement linkText = driver.findElement(By.linkText("Forgotten password?"));
        System.out.println(linkText.getAttribute("href"));
        System.out.println(linkText.getTagName());

        System.out.println(linkText.getCssValue("color"));
        System.out.println(linkText.getCssValue("font-size"));
        System.out.println(linkText.getCssValue("font-family"));
    }
}
