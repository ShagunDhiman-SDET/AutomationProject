package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GettingTheOptions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        Select  s = new Select(driver.findElement(By.id("year")));
        List<WebElement> allOptions = s.getOptions();
        for (int i=0;i<allOptions.size();i++)
        {
            System.out.println(allOptions.get(i).getText());
        }

        for (WebElement options:allOptions)
        {
            System.out.println(options.getText());
        }


    }


}
