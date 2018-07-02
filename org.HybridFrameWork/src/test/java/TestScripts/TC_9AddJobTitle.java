package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.Admin;
import BusinessFunctions.JobTitle;

public class TC_9AddJobTitle extends RootText{
	@Test
	public void AddJobTitle() throws IOException, Exception
	{

		JobTitle jt=new JobTitle(browser, jl,profile1,profilepath);
		jt.AddJobTitel();
		
	}
	

}
