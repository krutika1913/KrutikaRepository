package Session1.Part1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		//rules to take screenshot
		
		//create folder to store screenshots/evidences while doing testing
		//tell driver to take screenshot
		//use takescreenshot interface
		//then create object of interface
		//driver is reference variable of WebDriver interface
		//with the help of ref. var. of takescreenshot interface use getScreenshotas method.
	    //if we take screenshot then it is stored in the File format 
		
		launch_browser("Chrome");
		
		Thread.sleep(2000);
		//to take screenshot we need to write those 4 lines of code
        TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);//first we take screenshot
		File target = new File("./Evidences/browser_launched_2.png");//then we store it to a specific folder
		FileHandler.copy(source, target);
		
		hiturl("https://snapdeal.com/");
        
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Evidences/url_hit_2.png");
		FileHandler.copy(source1, target1);
		
		WebElement searchbox = driver.findElement(By.cssSelector("input#inputValEnter"));
		searchbox.sendKeys("kitchen products");
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts.getScreenshotAs(OutputType.FILE);
		File target2 = new File("./Evidences/search_kitchen_product.png");
		FileHandler.copy(source2, target2);
		
		Thread.sleep(2000);
		
		//2nd way to take screenshot by using user directory or by using project name
		//By declaring project path
		
		searchbox.clear();
		searchbox.sendKeys("mobile cover");
		Thread.sleep(2000);
		
		String Projectpath = System.getProperty("user.dir");//user's directory
		
		System.out.println(Projectpath);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File source3 = ts.getScreenshotAs(OutputType.FILE);
		File target3 = new File(Projectpath + "\\Evidences\\mobile_cover_search.png");
		FileHandler.copy(source3, target3);
		
        
		
		

	}

}
