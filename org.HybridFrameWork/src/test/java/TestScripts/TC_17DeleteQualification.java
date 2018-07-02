package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Qualification;

public class TC_17DeleteQualification extends RootText{
	@Test
	public void DeleteEduction() throws IOException, Exception
	{
		Qualification qualification=new Qualification(browser, jl, profile3, Qualificationpath);
		qualification.DeleteQualification();
	}

}
