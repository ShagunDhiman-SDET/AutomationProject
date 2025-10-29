package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskAllScripts {
    public static void main(String[] args) throws InterruptedException {
        //get(String url)
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.instagram.com");
        //getTitle()
        String title = driver.getTitle();
        System.out.println(title);
        //match actual title = expected title
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        if (actualtitle.equals("Instagram"))
            System.out.println("login page is displayed");
        else
            System.out.println("login page is not displayed");

        //getCurrentUrl++
        String currentTitle =driver.getCurrentUrl();
        System.out.println(currentTitle);

        //manage method for maximize window
        driver.manage().window().maximize();
        // capturing the source code
        String sc = driver.getPageSource();
        System.out.println(sc);

        driver.manage().window().maximize();
        // launching the application
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);
        // close is used to close parent window
        driver.findElement(By.linkText("Open a popup window")).click();
        Thread.sleep(3000);
        //close is used to close the parent window
        //driver.close();
        // quit is used to close the parent window or child window
        // driver.quit();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.swiggy.com");
        Thread.sleep(2000);
        driver.get("https://www.zomato.com");
        Thread.sleep(2000);
        // go back
        driver.navigate().back();
        Thread.sleep(2000);
        // move forward
        driver.navigate().forward();
        Thread.sleep(2000);
        // refresh browser
        driver.navigate().refresh();
        Thread.sleep(2000);
        // close the browser
        driver.quit();

    }
}
