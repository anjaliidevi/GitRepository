package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Employee;

public class TC_2AddEmployee extends RootText {
	
	@Test
	public void tc2() throws IOException, Exception
	{
		
	Employee bf=new Employee(browser, jl);
	Admin Ad=new Admin(browser, jl);
	Ad.LoginApp();

	bf.AddEmplyee();
	
	bf.PhotFile();

}
}