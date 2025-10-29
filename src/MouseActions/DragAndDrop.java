package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        a.dragAndDrop(driver.findElement(By.xpath("//div[text()='Mobile Cover']")),
                driver.findElement(By.xpath("//div[text()='Mobile Accessories']"))
        ).perform();


    }
    }
