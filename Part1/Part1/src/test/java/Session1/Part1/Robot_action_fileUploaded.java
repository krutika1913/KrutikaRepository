package Session1.Part1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_action_fileUploaded {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.findElement(By.xpath("//span[text()=\"Select PDF file\"]")).click();
		
		StringSelection ss = new StringSelection("\"C:\\Users\\Hp\\Downloads\\Colorful Illustrated Science Information Poster.pdf\"");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot rt = new Robot();
		
		rt.delay(4000);
		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);
		
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//span[text()=\"Convert to WORD\"]")).click();	

	}

}
