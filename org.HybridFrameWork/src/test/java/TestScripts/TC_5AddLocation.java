package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.Location;
import ElementLocaters.jxlfile;
import LIB.common;

public class TC_5AddLocation extends RootText{
	@Test
	public void ALocation() throws IOException, Exception
	{
		Admin Ad=new Admin(browser, jl);

		Location l=new Location(browser,jl);
		l.AddLocation();
		
	}

}
