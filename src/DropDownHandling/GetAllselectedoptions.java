package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetAllselectedoptions {


    public static void main(String[] args) {


        WebDriver driver  = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");


        WebElement dropdown = driver.findElement(By.id("multiselect1"));


        Select s = new Select(dropdown);


        for ( int i =1;i<=3;i++){
            s.selectByIndex(i);
        }
        List<WebElement> allselected = s.getAllSelectedOptions();
        for (WebElement s1:allselected){
            System.out.println(s1.getText());
        }


        //getwrapped element

        WebElement alloptions = s.getWrappedElement();
        System.out.println(alloptions.getText());
    }
}
