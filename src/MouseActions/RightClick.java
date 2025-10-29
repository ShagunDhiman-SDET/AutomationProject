package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.paytm.com");
        Actions a = new Actions(driver);
        a.contextClick(driver.findElement(By.xpath("//div[text()='Download App']"))).perform();
    }
}
