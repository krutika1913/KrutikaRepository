package Session1.Part1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class window_handles extends Dynamic_code{
	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		hiturl("https://www.naukri.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement about_us = driver.findElement(By.xpath("//a[text()=\"About us\"]"));
		
		Thread.sleep(1500);
		
		about_us.click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> it = window.iterator();
		
		String parent_window_id = it.next();
		System.out.println(parent_window_id);
		
		String child_window_id = it.next();
		System.out.println(child_window_id);
		
		Thread.sleep(1500);
		
		driver.switchTo().window(child_window_id);
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//a[text()=\"LEARN MORE\"]")).click();
		
		Thread.sleep(1500);
		
		driver.navigate().back();
		
		Thread.sleep(1500);
		
		driver.switchTo().window(parent_window_id);
		
		
	}

}
