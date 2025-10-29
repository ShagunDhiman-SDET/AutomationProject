package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class WorkingWithCSSSelector {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter 1 for Female 2 For Male and -1 For Custom ");
        int value = s.nextInt();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement gender = driver.findElement(By.cssSelector("input[value='"+value+"']"));
        gender.click();
    }
}
