package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Location;

public class TC_8DeleteMultipleLocation extends RootText{
	@Test
	public void DelteMultipleLocations() throws IOException, Exception
	{
		
	
	Admin ad=new Admin(browser, jl);
	ad.LoginApp();
	Location loc=new Location(browser, jl);
	loc.DeletemultipleLocations();
	}
	
}
