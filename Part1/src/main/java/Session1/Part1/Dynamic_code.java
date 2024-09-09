package Session1.Part1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_code {
	
	public static WebDriver driver;
	
	public static void launch_browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefor")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("launch browser is :- " +  browser);
	}
	
	public static void hiturl(String url) {
		
		driver.get(url);
		
		System.out.println(driver.getTitle());
	}
	
	public static void takescreenshot(String screenshot_name) throws Throwable{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);//first we take screenshot
		File target = new File("./Screenshots/"+ screenshot_name +".png");//then we store it to a specific folder
		FileHandler.copy(source, target);
	}
}
