package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Qualification;

public class TC_15AddQualification extends RootText{
	@Test
	public void AddQualification() throws Exception
	{
		Qualification qual=new Qualification(browser, jl, profile3, Qualificationpath);
		qual.AddQualification();
	}

}
