package Session1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class action_class_keyboardFunction extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");

		hiturl("https://www.jeevansathi.com/");
		
		Actions act = new Actions(driver);
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		act.moveToElement(email).click().sendKeys("komalwankhede129929@gmail.com").build().perform();
		
		Thread.sleep(1500);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(1500);
		
		WebElement eye_btn = driver.findElement(By.cssSelector("div#eye"));

		act.moveToElement(eye_btn).click().build().perform();
		
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_DOWN).click().build().perform();
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_DOWN).click().build().perform();
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_DOWN).click().build().perform();
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_DOWN).click().build().perform();
		
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_UP).click().build().perform();
		Thread.sleep(1500);
		act.keyDown(Keys.PAGE_UP).click().build().perform();
		
	}

}
