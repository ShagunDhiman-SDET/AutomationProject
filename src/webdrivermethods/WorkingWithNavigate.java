package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.swiggy.com");
        Thread.sleep(2000);
        driver.get("https://www.zomato.com");
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        Thread.sleep(2000);
        // move forward
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh browser
        driver.navigate().refresh();
        Thread.sleep(2000);
        // close the browser
        driver.quit();



    }
}
