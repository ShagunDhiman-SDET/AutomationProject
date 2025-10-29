package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {
    public static void main(String[] args) {

        // launch the browser
        WebDriver driver = new ChromeDriver();

        // launching the application
        driver.get("https://www.zomato.com");

        //manage method for maximize window
        driver.manage().window().maximize();
       // capturing the source code
        String sc = driver.getPageSource();
        System.out.println(sc);


    }
}
