package AssignmentLaunchBrowsers;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserFromUserWithSwitch {
	
	static WebDriver driver;

	public static void main(String[] args) {
		while (true) {
			Scanner s  = new Scanner(System.in);
			System.out.println("enter browsers name");
			String browser = s.next();
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		}
			else if (browser.equalsIgnoreCase("edge")) {
		driver = new  EdgeDriver();
		}
			else {
				System.out.println("invalid browser");
			}
		}
	

}
}
