package Session1.Part1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) {
		
		//To launch chrome browser we need to create object of WebDriver class
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		
		System.out.println("Title before search :- " + driver.getTitle());
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchBox.sendKeys("Gift Cards");
		
		System.out.println(searchBox.getAttribute("value"));
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println("Title after search :- " + driver.getTitle());
		
		driver.findElement(By.xpath("//img[@alt=\"Physical Gift Cards\"]")).click();
		
		System.out.println("Title after clicking on physical gift cards :- " + driver.getTitle());
		
		driver.findElement(By.xpath("//img[@class=\"s-image\"][@alt=\"Amazon.com Gift Card in a Birthday Pop-Up Box\"]")).click();
		
		System.out.println(driver.getTitle());
		
		searchBox.sendKeys("Mobiles");
	
//		driver.close();
		}

}
