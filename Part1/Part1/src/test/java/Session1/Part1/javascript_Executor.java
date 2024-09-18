package Session1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class javascript_Executor extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		takescreenshotJS("browser_launch");
		
		Thread.sleep(2000);
		
		hiturl("https://www.jeevansathi.com/");
		takescreenshotJS("jeevansathi webpage");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)"); 
		takescreenshotJS("scroll by 700");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-700)"); 
		takescreenshotJS("scroll by -700");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		takescreenshotJS("after scrolling ss upto bottom");
		
		driver.findElement(By.xpath("//a[text()=\"About Us\"]")).click();
		
		//navigate backward
		js.executeScript("window.history.back()");
//		driver.navigate().back();
		
		//navigate forward
		js.executeScript("window.history.forward()");
//		driver.navigate().forward();
		
		//to refresh page 
		js.executeScript("window.history.go(0)"); 
		driver.navigate().refresh();
		
		driver.close();

	}

}
