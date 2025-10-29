package RELATIVEXPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.Scanner;

public class AutomateBlinkit {


    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = s.nextLine();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blinkit.com/s/?q=vegetables");
        driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
        Thread.sleep(3000);
        List<WebElement> allVegetables = driver.findElements(By.xpath("//div[@class='tw-text-300 tw-font-semibold tw-line-clamp-2']"));
        System.out.println(allVegetables.size());
        int count =0;
        for(WebElement vegetables:allVegetables)
        {
            if(vegetables.getText().equals(name)) {
                driver.findElement(By.xpath("//div[text()='" + vegetables.getText() + "']/../../..//div[text()='ADD']")).click();
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("Product not found");
        }

}
}


