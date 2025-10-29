package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseCursor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();



            driver.manage().window().maximize();
            driver.get("https://www.bluestone.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[text()='Not now']")).click();
            Thread.sleep(2000);

            Actions a = new Actions(driver);
            a.moveToElement(driver.findElement(By.xpath("//a[@title='Watch Jewellery']"))).perform();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Band")).click();
        }

}
