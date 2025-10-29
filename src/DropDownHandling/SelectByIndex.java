package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        selectOptionsByUsingVisbleText(driver.findElement(By.id("day")),"15");
        selectOptionsByUsingVisbleText(driver.findElement(By.id("month")),"Aug");
        selectOptionsByUsingVisbleText(driver.findElement(By.id("year")),"1947");






    }

    public static void selectOptionsByUsingVisbleText(WebElement dropdownReference,String text)
    {
        Select s = new Select(dropdownReference);
        s.selectByVisibleText(text);
    }
}
