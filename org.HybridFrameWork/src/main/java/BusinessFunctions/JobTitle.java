package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ElementLocaters.jxlfile;
import LIB.common;

public class JobTitle {
	common brow;
	jxlfile jl;
	Properties profile1;
	public JobTitle(common x,jxlfile y,Properties z,String profilepath) throws IOException, Exception
	{
		brow=x;
		jl=y;
		profile1=z;
		profile1.load(new FileInputStream(profilepath));
	}
	
	public  void AddJobTitel() throws IOException, Exception
	{
		
		
		jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");
		
		String JobName=jl.ReadDataFromxlsSheet4(0, 1);
		String JobDescription=jl.ReadDataFromxlsSheet4(1, 1);
		
		String Adminid=profile1.getProperty("Admin_id");	
		String Adminloc=profile1.getProperty("Admin_loc");
		String jobid=profile1.getProperty("job_id");
		String jobloc=profile1.getProperty("job_loc");
		String jobTitleid=profile1.getProperty("jobTitle_id");
		String jobTitleloc=profile1.getProperty("jobTitle_loc");
		String Frameloc=profile1.getProperty("Frame_loc");
		
		String addid=profile1.getProperty("Add1_id");
		String addloc=profile1.getProperty("Add1_loc");
		
		String saveid=profile1.getProperty("save_Id");
		String saveLocaer=profile1.getProperty("save_Locater");
		String jobNameid=profile1.getProperty("jobName_id");
		String jobNameLocater=profile1.getProperty("jobName_Locater");
		String jobDescriptiobid=profile1.getProperty("jobDescription_id");
		String jobDescriptionLoc=profile1.getProperty("jobDescription_Locater");
		String EditId=profile1.getProperty("Edit_id");
		String Editloc=profile1.getProperty("Edit_loc");
		String EditEsid=profile1.getProperty("Editemployee_id");
		String EditEsloc=profile1.getProperty("Editemployee_loc");
		String Statusid=profile1.getProperty("status_id");
		String StatusLoc=profile1.getProperty("Status_loc");
		String Addid=profile1.getProperty("Add_id");
		String AddLoc=profile1.getProperty("Add_loc");
		String Saveid=profile1.getProperty("save_id");
		String Saveloc=profile1.getProperty("save_loc");	
		
		
		Admin ad=new Admin(brow, jl);
		ad.LoginApp();
		brow.VerifyElement(Adminid,Adminloc, "ADMIN");
		brow.StartAction();
		brow.MouseOver(Adminid,Adminloc);
		//wait for some time
		brow.Thread(2000);
		brow.VerifyElement(jobid,jobloc, "Job");
		brow.StartAction();
		brow.MouseOver(jobid,jobloc);
		brow.VerifyElement(jobTitleid,jobTitleloc, "jobTitles");
		brow.click(jobTitleid,jobTitleloc);
		brow.Thread(2000);
		brow.SwitchToFrame(Frameloc);
		//verify Add Element
		brow.VerifyElement(addid,addloc, "Add");
		brow.click(addid,addloc);
		//verify Save button
		brow.VerifyElement(saveid, saveLocaer, "Save");
		brow.click(saveid,saveLocaer);
		brow.Alert();
		brow.VerifyElement(jobNameid, jobNameLocater, "JobName");
		brow.sendkeys(jobNameid, jobNameLocater, JobName);
		brow.click(saveid, saveLocaer);
		brow.Alert();
		brow.VerifyElement(jobDescriptiobid, jobDescriptionLoc, JobDescription);
		brow.sendkeys(jobDescriptiobid, jobDescriptionLoc, JobDescription);
		brow.Thread(2000);
		brow.click(saveid, saveLocaer);
		brow.VerifyElement(EditId, Editloc, "Edit");
		brow.click(EditId, Editloc);
		brow.VerifyElement(EditEsid, EditEsloc, "EditEmployeestatus");
		brow.click(EditEsid, EditEsloc);
		brow.Alert();
		brow.Dropdown(Statusid, StatusLoc, "Part Time Contract");
		brow.VerifyElement(Addid, AddLoc, "Add");
		brow.click(Addid, AddLoc);
		brow.VerifyElement(Saveid, Saveloc, "save");
		brow.click(Saveid, Saveloc);
		brow.close();
		brow.quit();		
	}
	public void EditJobTitle() throws IOException, Exception
	{
		jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");		
		String JobName=jl.ReadDataFromxlsSheet4(0, 1);
		
		String Adminid=profile1.getProperty("Admin_id");	
		String Adminloc=profile1.getProperty("Admin_loc");
		String jobid=profile1.getProperty("job_id");
		String jobloc=profile1.getProperty("job_loc");
		String jobTitleid=profile1.getProperty("jobTitle_id");
		String jobTitleloc=profile1.getProperty("jobTitle_loc");
		String Frameloc=profile1.getProperty("Frame_loc");
		String Statusid=profile1.getProperty("status_id");
		String StatusLoc=profile1.getProperty("Status_loc");
		String EditEsid=profile1.getProperty("Edit_id");
		String EditEsloc=profile1.getProperty("Edit_loc");
		String Addid=profile1.getProperty("Add_id");
		String AddLoc=profile1.getProperty("Add_loc");
		String Saveid=profile1.getProperty("save_id");
		String Saveloc=profile1.getProperty("save_loc");	

		Admin ad=new Admin(brow, jl);
		//Login Application
		ad.LoginApp();
		brow.VerifyElement(Adminid,Adminloc, "ADMIN");
		brow.StartAction();
		brow.MouseOver(Adminid,Adminloc);
		//wait for some time
		brow.Thread(2000);
		brow.VerifyElement(jobid,jobloc, "Job");
		brow.StartAction();
		brow.MouseOver(jobid,jobloc);
		brow.VerifyElement(jobTitleid,jobTitleloc, "jobTitles");
		brow.click(jobTitleid,jobTitleloc);
		brow.SwitchToFrame(Frameloc);
		brow.verifyInTableAndclickonIt(JobName);
		brow.Thread(2000);
		brow.VerifyElement(EditEsid, EditEsloc, "Edit");
		brow.click(EditEsid,EditEsloc);
		brow.Dropdown(Statusid, StatusLoc, "Part Time Contract");
		brow.VerifyElement(Addid, AddLoc, "Add");
		brow.click(Addid, AddLoc);
		brow.VerifyElement(Saveid, Saveloc, "save");
		brow.click(Saveid, Saveloc);
		brow.close();
		brow.quit();	
		
	}
	public void DeleteJobTitle() throws IOException, Exception
	{
		

		jl.jxlFile();
		jl.exl("D:\\OrangeHRM.xls");		
		String JobName=jl.ReadDataFromxlsSheet4(0, 1);
		
		String Adminid=profile1.getProperty("Admin_id");	
		String Adminloc=profile1.getProperty("Admin_loc");
		String jobid=profile1.getProperty("job_id");
		String jobloc=profile1.getProperty("job_loc");
		String jobTitleid=profile1.getProperty("jobTitle_id");
		String jobTitleloc=profile1.getProperty("jobTitle_loc");
		String Frameloc=profile1.getProperty("Frame_loc");
		String checkboxxpath=profile1.getProperty("checkbox_xpath");
		String Deletid=profile1.getProperty("Delte_id");
		String Deleteloc=profile1.getProperty("Delete_loc");
		String Messageid=profile1.getProperty("Messagbox_id");
		String MessageLoc=profile1.getProperty("Messagebox_loc");
	
		Admin ad=new Admin(brow, jl);
		//Login Application
		ad.LoginApp();
		brow.VerifyElement(Adminid,Adminloc, "ADMIN");
		brow.StartAction();
		brow.MouseOver(Adminid,Adminloc);
		//wait for some time
		brow.Thread(2000);
		brow.VerifyElement(jobid,jobloc, "Job");
		brow.StartAction();
		brow.MouseOver(jobid,jobloc);
		brow.VerifyElement(jobTitleid,jobTitleloc, "jobTitles");
		brow.click(jobTitleid,jobTitleloc);
		brow.SwitchToFrame(Frameloc);
		brow.Thread(2000);
		brow.MultpleCheckboxes(checkboxxpath);
		brow.VerifyElement(Deletid, Deleteloc, "Delete");
		brow.click(Deletid, Deleteloc);
		brow.Alert();
		brow.messagebox(Messageid, MessageLoc);
		brow.close();
		brow.quit();		

	}
	

}
