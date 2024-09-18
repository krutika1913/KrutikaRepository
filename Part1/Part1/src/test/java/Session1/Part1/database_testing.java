package Session1.Part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

public class database_testing extends Dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		//String host = "localhost";//both things are fixed
		//String portnumber = "3306";
		
		
		launch_browser("chrome");
		hiturl("https://intapidm.infosysapps.com/auth/realms/careersite/protocol/openid-connect/auth?client_id=careersite&redirect_uri=https%3A%2F%2Fcareer.infosys.com%2Fjobs%2FjobsStatus%3Fcompanyhiringtype%3DIL%26countrycode%3DIN%26searchJob%3Dundefined&state=8d2e1dac-21b4-485a-88d7-bdaa01bfc1f6&response_mode=fragment&response_type=code&scope=openid&nonce=dfffeb56-c004-4e84-81b8-0e1e4d6ea834");
		
		//jdbc connection
	    //url - "jdbc:mysql://host:portnumber/databasename"
		//host = localhost & portnumber = 3306
		//user - root
		//password - Krutik@1913
		
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "Krutik@1913");
		Statement cs = connect.createStatement();//to reach our script/code to the mysql in our system we create the statement
	    ResultSet rs = cs.executeQuery("select email,password from infosys_user where emp_id = 2;");
	    //resultSet store data in the form of array
	    rs.next(); 
	    System.out.println(rs.getString("email"));
	    System.out.println(rs.getString("password"));
	    
	    driver.findElement(By.cssSelector("input#username")).sendKeys(rs.getString("email"));
	    driver.findElement(By.cssSelector("input#username")).sendKeys(rs.getString("password"));
	 
	    
	}

}
