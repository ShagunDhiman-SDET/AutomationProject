package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        Thread.sleep(2000);
        WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
        Select s = new Select(multiSelectDropdown);
        System.out.println(s.isMultiple());
    }
}
