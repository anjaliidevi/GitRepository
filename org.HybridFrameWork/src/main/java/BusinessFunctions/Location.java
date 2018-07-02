package BusinessFunctions;

import java.io.IOException;

import ElementLocaters.jxlfile;
import LIB.common;

public class Location {
	
	common brow;
	jxlfile jl;
	public Location(common x,jxlfile y)
	{
		brow=x;
		jl=y;
	}
	
	public void AddLocation() throws IOException, Exception
	{
		Admin a=new Admin(brow, jl);
		a.LoginApp();
		
		
		
		
		jl.jxlFile();
			jl.exl("D:\\OrangeHRM.xls");
			
			String Name=jl.ReadDataFromxlsSheet3(0,1);
			String Address=jl.ReadDataFromxlsSheet3(1,1);
			String Zipcode=jl.ReadDataFromxlsSheet3(2,1);
			
		//verify Admin Element present
		brow.VerifyElement("xpath", "//ul[@id='nav']/li[@id='admin']", "ADMIN");
		brow.StartAction();
		brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='admin']");
		//wait for some time
		brow.Thread(1000);
		//mouse over on company Info
		brow.StartAction();
		brow.MouseOver("xpath","//a[@class='l2_link parent companyinfo']/span");
		//click on Locations
		brow.click("xpath", "//*[@id='admin']/ul/li[1]/ul/li[2]/a/span");
		brow.Thread(2000);
		brow.SwitchToFrame("rightMenu");
		//click on Add
		brow.VerifyElement("xpath", "//div[@class='actionbuttons']/input[1]", "Add");
		brow.click("xpath", "//div[@class='actionbuttons']/input[1]");
		brow.sendkeys("id", "txtLocDescription", Name);
		//click on Submit
		brow.click("className", "savebutton");
		brow.Alert();
		brow.Dropdown("id", "cmbCountry","India");
		//click on Submit
		brow.click("className", "savebutton");
		brow.Alert();
		brow.sendkeys("id", "txtAddress",Address );
		brow.sendkeys("id", "txtZIP",Zipcode);
		brow.click("className", "savebutton");
		brow.messagebox("xpath","//div[@class='messagebar']/span");
		brow.close();
		brow.quit();	
		
	}
	public void EditLocation() throws Exception
	{

		//verify Admin Element present
				brow.VerifyElement("xpath", "//ul[@id='nav']/li[@id='admin']", "ADMIN");
				brow.StartAction();
				brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='admin']");
				//wait for some time
				brow.Thread(1000);
				//mouse over on company Info
				brow.StartAction();
				brow.MouseOver("xpath","//a[@class='l2_link parent companyinfo']/span");
				//click on Locations
				brow.click("xpath", "//*[@id='admin']/ul/li[1]/ul/li[2]/a/span");
				//switch to frame
				brow.SwitchToFrame("rightMenu");

		brow.verifyElementInTableandClick("RVP");
		String code=brow.FindElementByLocaters("id", "txtLocationCode").getAttribute("value");
		System.out.println(code);
		//click on Edit
		brow.VerifyElement("id","editBtn", "Edit");
		brow.click("id","editBtn");
		//click on save button
		brow.VerifyElement("className", "savebutton","save");
		brow.click("className", "savebutton");
		brow.close();
		brow.quit();
		
	}
	//Delete Employee
	public void DeleteLocation() throws Exception
	{
		//verify Admin Element present
		brow.VerifyElement("xpath", "//ul[@id='nav']/li[@id='admin']", "ADMIN");
		brow.StartAction();
		brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='admin']");
		//wait for some time
		brow.Thread(1000);
		//mouse over on company Info
		brow.StartAction();
		brow.MouseOver("xpath","//a[@class='l2_link parent companyinfo']/span");
		//click on Locations
		brow.click("xpath", "//*[@id='admin']/ul/li[1]/ul/li[2]/a/span");
		//switch to frame
		brow.SwitchToFrame("rightMenu");
		brow.checkbox("RVP");
		//verify delete element present or not
		brow.VerifyElement("xpath","//div[@class='actionbuttons']/input[2]","Delete");
		brow.click("xpath","//div[@class='actionbuttons']/input[2]");
		brow.Alert();
		brow.close();
		brow.quit();

	}
	public void DeletemultipleLocations() throws Exception
	{
		brow.VerifyElement("xpath", "//ul[@id='nav']/li[@id='admin']", "ADMIN");
		brow.StartAction();
		brow.MouseOver("xpath", "//ul[@id='nav']/li[@id='admin']");
		//wait for some time
		brow.Thread(1000);
		//mouse over on company Info
		brow.StartAction();
		brow.MouseOver("xpath","//a[@class='l2_link parent companyinfo']/span");
		//click on Locations
		brow.click("xpath", "//*[@id='admin']/ul/li[1]/ul/li[2]/a/span");
		//switch to frame
		brow.SwitchToFrame("rightMenu");
		brow.Thread(2000);
		brow.MultpleCheckboxes("/html/body/div/div[2]/form/table/tbody/tr/td[1]/input");
		//verify Delete element 
		brow.VerifyElement("xpath","//div[@class='actionbuttons']/input[2]","Delete");
		brow.click("xpath","//div[@class='actionbuttons']/input[2]");
		brow.Alert();
		brow.messagebox("xpath","//div[@class='messagebar']/span");
		brow.Refresh();
		brow.close();
		brow.quit();
	}

}
