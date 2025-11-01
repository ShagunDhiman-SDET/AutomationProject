package AssignmentLaunchBrowsers;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;         
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowserFromUser {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);


		 
		 System.out.print("Enter browser name (chrome / edge/safari): ");
	        String browser = scanner.nextLine().toLowerCase();

	        
	        
	        



	        if (browser.equals("chrome")) {
	        	
	        WebDriver driver = new ChromeDriver();
	        System.out.println("chrome launched");
	        } else if (browser.equals("edge")) {
	        
	        	 WebDriver driver = new EdgeDriver();
	        	 System.out.println("edge launched");
	        } else {
	        	System.out.println("invalid browser");
	        }

	        

		
	}

}
