package Session1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dynamic_dropdown_railyatri extends Dynamic_code{
	
	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=CjwKCAjwufq2BhAmEiwAnZqw8tzkrutpLGLdwPQ8DFwgwwe5EpBtQIot0WIzeZtmAedPMaFSW-R3vRoCsvkQAvD_BwE");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1300)");
		
		driver.findElement(By.xpath("//span[@aria-hidden=\"true\"]")).click();
		
		WebElement from = driver.findElement(By.xpath("//input[@type=\"text\"]"));
	    from.sendKeys("nag");
	}

}
