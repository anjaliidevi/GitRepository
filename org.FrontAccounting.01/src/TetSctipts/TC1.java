package TetSctipts;

import org.testng.annotations.Test;

import LIB.BusinessFunctions;

public class TC1 {
	@Test
	public  void Direct()
	{
		BusinessFunctions Br=new BusinessFunctions();
		Br.ConfigDriver("Chrome");
		Br.OpenApp("http://apps.qaplanet.in/erp");
		Br.LoginFrontAccount("qaplanet1","lab1");
		Br.LogoutApp();
		Br.CloseBrowser();
		Br.QuitObject();
	}

}
