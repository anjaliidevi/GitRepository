package TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import BusinessFunctions.JobSpecification;

public class TC_14DeleteJobSpecification extends RootText {
	@Test
	public void DeleteJobSpecification() throws IOException, Exception
	{
		JobSpecification js=new JobSpecification(browser, jl, profile2, jsprofilepath);
		js.DeleteJobSpecification();
	}

}
