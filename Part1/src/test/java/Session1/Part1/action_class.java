package Session1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class action_class extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		hiturl("https://jqueryui.com/slider/");
		
		//locate draggable web element here first
		WebElement Draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		
		//then we create object for action class
		Actions act = new Actions(driver);
		
		//act.moveToElement(Draggable).click().build().perform();//to select Draggable web element
		System.out.println("title after clicking on draggable :-" + driver.getTitle());
		
		WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		//act.moveToElement(Themes).contextClick().build().perform();//to select Themes web element
		
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);//to switch on to frame from main window
		
		
		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));
		act.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
		
		Thread.sleep(3000);
		
		act.dragAndDropBy(slider, -400, 0).build().perform();
		
		driver.switchTo().defaultContent();
		
		WebElement Droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		act.moveToElement(Droppable).click().build().perform();
		
		System.out.println("title after clicking on droppable :- "+ driver.getTitle());
		
	    WebElement frame_1 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame_1);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		//act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
		//act.dragAndDrop(drag, drop).build().perform();
		
		
		
		
		
		
		
		
		
		
	}
}
