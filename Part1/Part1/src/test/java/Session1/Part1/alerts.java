package Session1.Part1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class alerts extends Dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		hiturl("https://demo.automationtesting.in/Alerts.html");
		
		//simple alert
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();
		
		Thread.sleep(2000);
		
		Alert simple_alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		simple_alert.accept();
		
		
		//confirmation alert
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Thread.sleep(2000);
		
		Alert confirmation_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		confirmation_alert.dismiss();
		Thread.sleep(2000);
		
		WebElement confirm_msg = driver.findElement(By.cssSelector("p#demo"));
		System.out.println(confirm_msg.getText());
		
		
		//prompt alert
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.btn.btn-info")).click();
        Thread.sleep(2000);
		
		Alert prompt_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt_alert.sendKeys("Krutika");
		Thread.sleep(2000);
		prompt_alert.accept();
		
		WebElement prompt_msg = driver.findElement(By.cssSelector("p#demo1"));
		System.out.println(prompt_msg.getText());
		
		
		
		
	}

}
