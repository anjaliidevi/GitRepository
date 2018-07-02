package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Qualification;

public class TC_16EditQualification extends RootText{
	@Test
	public void EditQualification() throws Exception
	{
		Qualification qul=new Qualification(browser, jl, profile3, Qualificationpath);
		qul.EditQualification();
	}

}
