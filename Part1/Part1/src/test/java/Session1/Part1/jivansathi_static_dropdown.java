package Session1.Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class jivansathi_static_dropdown extends Dynamic_code {
	public static void main(String[] args) {
		
		launch_browser("chrome");
		hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Jeevansathi_Registration&utm_term=jeevansathi%20com%20registration&gad_source=1&gclid=CjwKCAjwufq2BhAmEiwAnZqw8vs511yjzWD2NMa2KNthB_Nbc75bfRFID6bBZAWSfePdI70Gqsj5GBoCMdsQAvD_BwE");
		
	    //static dropdown
		
		WebElement create_profile_searchbox_ = driver.findElement(By.cssSelector("select#reg_relationship"));
		
		Select sd = new Select(create_profile_searchbox_);
		
     	//sd.selectByIndex(7);
		//sd.selectByValue("6D");
		sd.selectByVisibleText("Daughter");
		
	}
}
