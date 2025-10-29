package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        //get(String url)
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.facebook.com");
       // driver.get("https:www.instagram.com");
        //getTitle()
        String title = driver.getTitle();
        System.out.println(title);
        //match actual title = expected title
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        if (actualtitle.equals("Facebook – log in or sign up"))
            System.out.println("login page is displayed");
        else
        System.out.println("login page is not displayed");

        //getCurrentUrl
        String currentTitle =driver.getCurrentUrl();
        System.out.println(currentTitle);



    }
}






