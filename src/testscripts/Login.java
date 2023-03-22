package testscripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
		Thread.sleep(3000);
		
	

	}

}
