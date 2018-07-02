package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Employee;

public class TC_1VerifyOrangeHRM extends RootText {
@Test
public void tc() throws IOException, Exception{
	
	Employee bf=new Employee(browser, jl);
	bf.LoginApp();
	
	
}
}
