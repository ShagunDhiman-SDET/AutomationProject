package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
            Thread.sleep(3000);
            Actions a = new Actions(driver);
            a.clickAndHold(driver.findElement(By.id("circle"))).perform();
            Thread.sleep(8000);
            a.release().perform();
    }
}
