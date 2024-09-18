package Session1.Part1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class test_reports extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		 
		//dependency to add - aventstack package
		//create folder to store the reports
		
		//3 classes are responsible to generate the reports
		//ExtentSparkReporter, ExtentReports, ExtentTest
		
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		
		//to set/define outer structure
		
		//ExtentSparkReporter class - it specifies the path of the folder to store the report
		//and you can set certain configuration for the same
		//then we create object of extentsparkclass
		
	    ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\Reports\\functional_report");
	    //to set configuration we use config() method
	    report.config().setTheme(Theme.DARK);
	    report.config().setDocumentTitle("Antomation_functional_report");
	    report.config().setReportName("Functional Testing Report");
	    
	    //to define inner structure
	    
	    //ExtentReports - is responsible for creating a report
	    
	    ExtentReports er = new ExtentReports();
	    er.attachReporter(report);
	    //to attach defined configuration to report
	    
	    er.setSystemInfo("OS", "Windows");
	    er.setSystemInfo("Browser", "Chrome");
	    er.setSystemInfo("QA", "Krutika Wankhede");
	   
	    
	    //Extent Test
	    
	    //we create indirect object of extent class 
	    
	    ExtentTest test = er.createTest("Login functionality");
	    test.log(Status.INFO, "Chrome browser launched");
	    
	    launch_browser("chrome");
	    takescreenshot("chrome_browser");
	    test.addScreenCaptureFromPath(projectpath+"\\report_Screenshot\\chrome_browser");
	    
	    
	    
	    hiturl("https://bluedart.com/sign-in");
	    takescreenshot("login page");
	    test.addScreenCaptureFromPath(projectpath+"\\report_Screenshot\\login page");
	   
	    er.flush();
	    
	    

	}

}
