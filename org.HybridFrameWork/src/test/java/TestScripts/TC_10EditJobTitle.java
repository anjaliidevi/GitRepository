package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.JobTitle;

public class TC_10EditJobTitle extends RootText {
	@Test
	public void EditjobTitle() throws IOException, Exception
	{
		JobTitle jt=new JobTitle(browser, jl, profile1, profilepath);
		jt.EditJobTitle();
		
	}

}
