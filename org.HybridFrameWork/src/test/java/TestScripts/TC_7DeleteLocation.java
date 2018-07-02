package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Location;

public class TC_7DeleteLocation extends RootText{
	@Test
	public void DeleteLocation() throws IOException, Exception
	{
		Admin ad=new Admin(browser, jl);
		ad.LoginApp();
		Location loc=new Location(browser, jl);
		loc.DeleteLocation();
		
	}
	
}
