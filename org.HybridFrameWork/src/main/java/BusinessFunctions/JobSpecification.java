package BusinessFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ElementLocaters.jxlfile;
import LIB.common;

public class JobSpecification {
	common brow;
	jxlfile jl;
	Properties profile2;
	public JobSpecification(common x,jxlfile y,Properties z,String jsprofilepath) throws IOException, Exception
	{
		brow=x;
		jl=y;
		profile2=z;
		profile2.load(new FileInputStream(jsprofilepath));
	}
	
	public void AddjobSpecification() throws IOException, Exception
	{
		jl.exl("");jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");
		
		String jobspecificationName=jl.ReadDataFromxlsSheet5(0,1);
		
		String Admin=profile2.getProperty("Admin_id");
		String Adminloc=profile2.getProperty("Admin_loc");
		String jobid=profile2.getProperty("job_id");
		String jobloc=profile2.getProperty("job_loc");
		String jobsid=profile2.getProperty("jobSpecification_id");
		String jobsloc=profile2.getProperty("jobSpecification_loc");
		
		String Fram=profile2.getProperty("Frame_loc");
		String Addid=profile2.getProperty("Add_id");
		String Addloc=profile2.getProperty("Add_loc");
		
		String Nameid=profile2.getProperty("Name_id");
		String Nameloc=profile2.getProperty("Name_loc");
		
		String saveid=profile2.getProperty("Save_id");
		String saveloc=profile2.getProperty("Save_loc");
		
		String messageid=profile2.getProperty("Message_id");
		String messageloc=profile2.getProperty("Message_loc");
		
		
		Admin ad=new Admin(brow, jl);
		ad.LoginApp();
		 brow.VerifyElement(Admin,Adminloc, "Admin");
		 brow.StartAction();
		 brow.MouseOver(Admin, Adminloc);
		 brow.Thread(2000);
		 brow.StartAction();
		 brow.MouseOver(jobid, jobloc);
		 brow.VerifyElement(jobsid, jobsloc, "JobSpecification");
		 brow.click(jobsid, jobsloc);
		 brow.SwitchToFrame(Fram);
		 brow.VerifyElement(Addid, Addloc, "Add");
		 brow.click(Addid, Addloc);
		 brow.VerifyElement(saveid, saveloc, "save");
		 brow.click(saveid, saveloc);
		 brow.Alert();
		 brow.VerifyElement(Nameid, Nameloc, "Name");
		 brow.sendkeys(Nameid, Nameloc, jobspecificationName);
		 brow.click(saveid, saveloc);
		 brow.Thread(2000);
		 brow.messagebox(messageid, messageloc);
		 brow.close();
		 brow.quit();	 
		
	}
	public void EditJobSpecification() throws IOException, Exception
	{
		
		jl.exl("");jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");
		
		String jobspecificationName=jl.ReadDataFromxlsSheet5(0,1);
		String ejobspecificationName=jl.ReadDataFromxlsSheet5(0,2);
		
		Admin ad=new Admin(brow, jl);
		ad.LoginApp();
		String Admin=profile2.getProperty("Admin_id");
		String Adminloc=profile2.getProperty("Admin_loc");
		String jobid=profile2.getProperty("job_id");
		String jobloc=profile2.getProperty("job_loc");
		String jobsid=profile2.getProperty("jobSpecification_id");
		String jobsloc=profile2.getProperty("jobSpecification_loc");
		
		String Fram=profile2.getProperty("Frame_loc");
		String Addid=profile2.getProperty("Add_id");
		String Addloc=profile2.getProperty("Add_loc");
		
		String Nameid=profile2.getProperty("Name_id");
		String Nameloc=profile2.getProperty("Name_loc");
		
		String Esaveid=profile2.getProperty("Save_id");
		String Esaveloc=profile2.getProperty("Save_loc");
		
		brow.VerifyElement(Admin,Adminloc, "Admin");
		 brow.StartAction();
		 brow.MouseOver(Admin, Adminloc);
		 brow.Thread(2000);
		 brow.StartAction();
		 brow.MouseOver(jobid, jobloc);
		 brow.VerifyElement(jobsid, jobsloc, "JobSpecification");
		 brow.click(jobsid, jobsloc);
		 brow.SwitchToFrame(Fram);
		 brow.verifyInTableAndclickonIt(jobspecificationName);
		 brow.VerifyElement(Esaveid, Esaveloc, "Edit");
		 brow.click(Esaveid, Esaveloc);
		 brow.clear(Nameid, Nameloc);
		 brow.sendkeys(Nameid, Nameloc, ejobspecificationName);
		 brow.click(Esaveid, Esaveloc);
		 brow.Thread(2000);
		 brow.close();
		 brow.quit();
		 }
	public void DeleteJobSpecification() throws IOException, Exception
	{

		jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");
		
		String jobspecificationName=jl.ReadDataFromxlsSheet5(0,1);
		String ejobspecificationName=jl.ReadDataFromxlsSheet5(0,2);
		
		Admin ad=new Admin(brow, jl);
		ad.LoginApp();
		String Admin=profile2.getProperty("Admin_id");
		String Adminloc=profile2.getProperty("Admin_loc");
		String jobid=profile2.getProperty("job_id");
		String jobloc=profile2.getProperty("job_loc");
		String jobsid=profile2.getProperty("jobSpecification_id");
		String jobsloc=profile2.getProperty("jobSpecification_loc");
		
		String Delteid=profile2.getProperty("Delete_id");
		String Delteloc=profile2.getProperty("Delete_loc");
		
		String messageid=profile2.getProperty("Message_id");
		String messageloc=profile2.getProperty("Message_loc");
		
		String Fram=profile2.getProperty("Frame_loc");
		
		brow.VerifyElement(Admin,Adminloc, "Admin");
		 brow.StartAction();
		 brow.MouseOver(Admin, Adminloc);
		 brow.Thread(2000);
		 brow.StartAction();
		 brow.MouseOver(jobid, jobloc);
		 brow.VerifyElement(jobsid, jobsloc, "JobSpecification");
		 brow.click(jobsid, jobsloc);
		 brow.Thread(2000);
		 brow.SwitchToFrame(Fram);
		 brow.checkbox(ejobspecificationName);
		 brow.VerifyElement(Delteid,Delteloc, "Delete");
		 brow.click(Delteid,Delteloc);
		 brow.Alert();
		 brow.messagebox(messageid,messageloc);
		 brow.close();
		 brow.quit();		
}
	
	

}
