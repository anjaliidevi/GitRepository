package BusinessFunctions;

import java.io.IOException;

import org.testng.annotations.Test;

import ElementLocaters.jxlfile;
import LIB.common;

public class Admin {
	common brow;
	jxlfile read;
	 public Admin(common x,jxlfile y){
		 brow=x;
		 read=y;
	 }
	@Test
	public void LoginApp() throws IOException, Exception
	
	{   read.jxlFile();
		read.exl("D:\\OrangeHRM.xls");
		
		String browsername=read.ReadDataFromxls(0, 1);
		String username=read.ReadDataFromxls(2,1);
		String password=read.ReadDataFromxls(3, 1);
		String url=read.ReadDataFromxls(1, 1);
		
		
		
		brow.StartBrowser(browsername);
		brow.url(url);
		//To maximize The Browser
		brow.maximizeBrowser();
		brow.VerifyTitle("OrangeHRM - New Level of HR Management");
		//wait for Some Time
		brow.Thread(2000);
		//To verify username present or not
		brow.VerifyElement("className","loginText","username");
		//To clear the username textfield
		brow.clear("name","txtUserName");
		brow.sendkeys("name", "txtUserName",username);
		//To verify password is present or not 
		brow.VerifyElement("xpath","//td/input[@name='txtPassword']","password");
		//To clear The password Testfield
		brow.clear("name", "txtPassword");
		brow.sendkeys("name","txtPassword",password);
		//To verify The login button presnt or not
		brow.VerifyElement("name", "Submit","login");
		//To click on the login button
		brow.click("name", "Submit");
		brow.waitForPageLoad();
		//To verify Title of homepage
		brow.VerifyTitle("OrangeHRM");
		//To verity text in webpage
		brow.verifyText("//ul[@id='option-menu']/li[1]", "Welcome qaplanet1");
		//Wait For someTime
		brow.Thread(1000);
		//To verify Logout elment in home page
		brow.VerifyElement("xpath", "//ul[@id='option-menu']/li[3]/a","logout");
				
	}
	
	

}
