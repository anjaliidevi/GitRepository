package TestScripts;
import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Employee;
import TestScripts.RootText;

public class TC_4DeleteEmpoloyee extends RootText{
	@Test
	public void DeleteEmployee() throws IOException, Exception
	{
		Employee log=new Employee(browser, jl);
		Admin Ad=new Admin(browser, jl);
		Ad.LoginApp();

		log.DeleteEmploye();
		
	}

}
