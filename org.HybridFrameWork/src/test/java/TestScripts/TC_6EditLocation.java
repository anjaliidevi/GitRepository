package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Location;

public class TC_6EditLocation extends RootText {
	@Test
	public void ALocation() throws IOException, Exception
	{
		Admin Ad=new Admin(browser, jl);
		Ad.LoginApp();

		Location l=new Location(browser,jl);
		l.EditLocation();
		
	}
	

}
