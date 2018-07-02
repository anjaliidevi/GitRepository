package TestScripts;
import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Employee;
import TestScripts.RootText;

public class TC_3EditEmploee extends RootText {
	@Test
	public void EditEmployee()throws Exception
	{
		Employee log=new Employee(browser, jl);
		Admin Ad=new Admin(browser, jl);
		Ad.LoginApp();

		log.EditE();
		

	}

}
