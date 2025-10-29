package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class AutomateNaukriWithRobotClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

        driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();

        WebElement fileUpload = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
        http://fileUpload.click();
        Thread.sleep(2000);
        StringSelection s = new StringSelection("C:\\Users\\AMAN SINGH\\Downloads\\KOMAL CV.pdf");

        //access the clipboard
        Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
        c.setContents(s,null);

        //paste
        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);








    }
    }

