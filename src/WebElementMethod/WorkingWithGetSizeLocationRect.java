package WebElementMethod;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSizeLocationRect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement cna = driver.findElement(By.xpath("//a[text()='Create new account']"));
        // get the height and width
        Dimension size = cna.getSize();
        System.out.println(size.getHeight());
        System.out.println(size.getWidth());

        // get the x and y axis
        Point location = cna.getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());

        // get Rect
        Rectangle rect = cna.getRect();
        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
        System.out.println(rect.getX());
        System.out.println(location.getY());


    }
}
