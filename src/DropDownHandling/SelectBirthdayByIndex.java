package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class SelectBirthdayByIndex {
     public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/r.php?entry_point=login");


         // identify the dropdown
         WebElement dayDropdown = driver.findElement(By.id("day"));
         WebElement monthDropdown = driver.findElement(By.id("month"));
         WebElement yearDropdown = driver.findElement(By.id("year"));
         // create the object of Select Class
         Select dDropdown = new Select(dayDropdown);
         Select mDropdown = new Select(monthDropdown);
         Select yDropdown = new Select(yearDropdown);

         dDropdown.selectByIndex(22);
         mDropdown.selectByIndex(5);
                // yDropdown.selectByIndex(26);
                 // select by value
         yDropdown.selectByValue("1999");
     }
}
