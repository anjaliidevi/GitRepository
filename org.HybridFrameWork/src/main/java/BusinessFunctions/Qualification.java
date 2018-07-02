package BusinessFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ElementLocaters.jxlfile;
import LIB.common;

public class Qualification {
	common brow;
	jxlfile jl;
	Properties profile3;

public Qualification(common x,jxlfile y, Properties z,String Qualificationpath) throws IOException, IOException{
	brow=x;
	jl=y;
	profile3=z;
	profile3.load(new FileInputStream(Qualificationpath));
}
public void AddQualification() throws IOException, Exception
{
	jl.jxlFile();
	jl.exl("D:\\OrangeHRM.xls");
	
	String InstituteName=jl.ReadDataFromxlsSheet6(0,1);
	String Coursename=jl.ReadDataFromxlsSheet6(1,1);
	
	String Admin=profile3.getProperty("Admin_id");
	String Adminloc=profile3.getProperty("Admin_loc");
	String Qualificationid=profile3.getProperty("Qualification_id");
	String Qualificationloc=profile3.getProperty("Qualification_loc");
	String Educationid=profile3.getProperty("Education_id");
	String Educationloc=profile3.getProperty("Education_loc");
	String Frame=profile3.getProperty("Frame_loc");
	String Add=profile3.getProperty("Add_id");
	String Addloc=profile3.getProperty("Add_loc");
	String saveid=profile3.getProperty("save_id");
	String saveloc=profile3.getProperty("save_loc");
	String instituteid=profile3.getProperty("Institute_id");
	String instituteloc=profile3.getProperty("Institute_loc");
	String course=profile3.getProperty("Course_id");
	String courseloc=profile3.getProperty("Course_loc");
	String messageid=profile3.getProperty("message_id");
	String messageloc=profile3.getProperty("message_loc");
 
	
	Admin ad=new Admin(brow, jl);
	ad.LoginApp();
	brow.StartAction();
	brow.MouseOver(Admin, Adminloc);
	brow.Thread(1000);
	brow.VerifyElement(Qualificationid,Qualificationloc,"Qualification");
	brow.StartAction();
	brow.MouseOver(Qualificationid,Qualificationloc);
	brow.Thread(2000);
	brow.VerifyElement(Educationid, Educationloc, "Education");
	brow.click(Educationid,Educationloc);
	brow.SwitchToFrame(Frame);
	brow.VerifyElement(Add,Addloc,"Add");
	brow.click(Add,Addloc);
	brow.click(saveid, saveloc);
	brow.Alert();
	brow.VerifyElement(instituteid, instituteloc, "Institute");
	brow.sendkeys(instituteid, instituteloc, InstituteName);
	brow.click(saveid, saveloc);
	brow.Alert();
	brow.VerifyElement(course, courseloc, "Course");
	brow.sendkeys(course, courseloc,Coursename);
	brow.click(saveid, saveloc);
	brow.messagebox(messageid,messageloc);
	brow.close();
	brow.quit();
}
public void EditQualification() throws Exception
{
		
	jl.jxlFile();
	jl.exl("D:\\OrangeHRM.xls");
	
	String InstituteName=jl.ReadDataFromxlsSheet6(0,1);
	String Coursename=jl.ReadDataFromxlsSheet6(1,1);
	String ECoursename=jl.ReadDataFromxlsSheet6(1,2);
	
	String Admin=profile3.getProperty("Admin_id");
	String Adminloc=profile3.getProperty("Admin_loc");
	String Qualificationid=profile3.getProperty("Qualification_id");
	String Qualificationloc=profile3.getProperty("Qualification_loc");
	String Educationid=profile3.getProperty("Education_id");
	String Educationloc=profile3.getProperty("Education_loc");
	String Frame=profile3.getProperty("Frame_loc");
	String codeid=profile3.getProperty("Code_id");
	String  codeloc=profile3.getProperty("Code_loc");
	
	String saveid=profile3.getProperty("save_id");
	String saveloc=profile3.getProperty("save_loc");
	
	
	String instituteid=profile3.getProperty("Institute_id");
	String instituteloc=profile3.getProperty("Institute_loc");
	String course=profile3.getProperty("Course_id");
	String courseloc=profile3.getProperty("Course_loc");
	
	String messageid=profile3.getProperty("message_id");
	String messageloc=profile3.getProperty("message_loc");
	
	Admin ad=new Admin(brow, jl);
	ad.LoginApp();
	brow.StartAction();
	brow.MouseOver(Admin, Adminloc);
	brow.Thread(1000);
	brow.VerifyElement(Qualificationid,Qualificationloc,"Qualification");
	brow.StartAction();
	brow.MouseOver(Qualificationid,Qualificationloc);
	brow.Thread(2000);
	brow.VerifyElement(Educationid, Educationloc, "Education");
	brow.click(Educationid,Educationloc);
	brow.SwitchToFrame(Frame);
	brow.verifyElementInTableandClick(Coursename);
	String code=brow.FindElementByLocaters(codeid,codeloc).getAttribute("value");
	System.out.println(code);
	brow.click(saveid, saveloc);
	brow.clear(instituteid, instituteloc);
	brow.sendkeys(instituteid, instituteloc, InstituteName);
	brow.clear(course, courseloc);
	brow.sendkeys(course, courseloc,ECoursename);
	brow.click(saveid, saveloc);
	brow.messagebox(messageid, messageloc);
	brow.close();
	brow.quit();	
}

public void DeleteQualification() throws IOException, Exception
{
	
	jl.jxlFile();
	jl.exl("D:\\OrangeHRM.xls");
	
	String Admin=profile3.getProperty("Admin_id");
	String Adminloc=profile3.getProperty("Admin_loc");
	String Qualificationid=profile3.getProperty("Qualification_id");
	String Qualificationloc=profile3.getProperty("Qualification_loc");
	String Educationid=profile3.getProperty("Education_id");
	String Educationloc=profile3.getProperty("Education_loc");
	String Frame=profile3.getProperty("Frame_loc");
	String Deleteid=profile3.getProperty("Delete_id");
	String Deleteloc=profile3.getProperty("Delete_loc");
	
	String messageid=profile3.getProperty("message_id");
	String messageloc=profile3.getProperty("message_loc");
	
	String ECoursename=jl.ReadDataFromxlsSheet6(1,2);
	
	 Admin ad=new Admin(brow, jl);
	 ad.LoginApp();
	brow.StartAction();
	brow.MouseOver(Admin, Adminloc);
	brow.Thread(1000);
	brow.VerifyElement(Qualificationid,Qualificationloc,"Qualification");
	brow.StartAction();
	brow.MouseOver(Qualificationid,Qualificationloc);
	brow.Thread(2000);
	brow.VerifyElement(Educationid, Educationloc, "Education");
	brow.click(Educationid,Educationloc);
	brow.SwitchToFrame(Frame);
	brow.checkbox(ECoursename);
	brow.VerifyElement(Deleteid, Deleteloc, "delete");
	brow.click(Deleteid, Deleteloc);
	brow.Alert();
	brow.messagebox(messageid, messageloc);	
	brow.close();
	brow.quit();
	
}

}
