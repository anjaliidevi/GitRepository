package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.JobTitle;

public class TC_11DeleteJobTitle extends RootText{
	@Test
	public void DeleteJobTitle() throws IOException, Exception
	{
		JobTitle jt=new JobTitle(browser, jl, profile1, profilepath);
		jt.DeleteJobTitle();
		
	}

}
