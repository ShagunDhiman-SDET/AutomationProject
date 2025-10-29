package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpAndDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com");
        JavascriptExecutor j =(JavascriptExecutor) driver;
        // scroll down
        for (int i = 0;i<2;i++){
            Thread.sleep(2000);
            j.executeScript("window.scrollBy(0,1000)");
        }

        // scroll up
        for (int i = 0;i<2;i++){

            Thread.sleep(2000);
            j.executeScript("window.scrollBy(0,-1000)");
        }
    }
}
