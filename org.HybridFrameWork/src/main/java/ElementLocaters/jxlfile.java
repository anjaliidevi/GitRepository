package ElementLocaters;

import java.io.File;
import java.io.IOException;

import org.apache.bcel.generic.CPInstruction;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class jxlfile {
	File f1;
	Workbook wb;
	Sheet s;
	Sheet s1;
	Sheet s2;
	Sheet s3;
	Sheet s4;
	Sheet s5;
	
	
	@Test
	public void jxlFile() throws Exception
	{
		WritableWorkbook wb=Workbook.createWorkbook(new File("D:\\OrangeHRM.xls"));
		WritableSheet  sheet=wb.createSheet("login", 0);
		WritableSheet sheet2=wb.createSheet("Add", 1);
		WritableSheet sheet3=wb.createSheet("Location", 2);
		WritableSheet sheet4=wb.createSheet("JobTitle", 3);
		WritableSheet sheet5=wb.createSheet("Jobspecification", 4);
		WritableSheet sheet6=wb.createSheet("Education", 5);
		
		Label JobSpecification=new Label(0, 0,"JobName");
		Label JobSpecificationName=new Label(0, 1,"Manager");
		Label EJobSpecificationName=new Label(0, 2,"TeamLead");
		
		
		
		sheet5.addCell(JobSpecification);
		sheet5.addCell(JobSpecificationName);
		sheet5.addCell(EJobSpecificationName);
		
		Label Institute=new Label(0, 0, "Institute");
		Label Course=new Label(1, 0, "Course");
		Label InstituteName=new Label(0, 1, "QAPlanet");
		Label CourseName=new Label(1, 1, "Automation");
		Label EcourseName=new Label(1,2, "ManulaTesting");
		
		sheet6.addCell(Institute);
		sheet6.addCell(Course);
		sheet6.addCell(InstituteName);
		sheet6.addCell(CourseName);
		sheet6.addCell(EcourseName);
	

		Label JobName=new Label(0, 0,"JobName");
		Label JobDescription=new Label(1, 0,"JobDescription");
		Label JobTitleName=new Label(0, 1,"Automation");
		Label JobDescriptions=new Label(1, 1,"Generating Scripts");
		
		
		
		Label l=new Label(0, 0,"Browser");
		Label l1=new Label(1, 0,"URL");
		Label l2=new Label(2, 0, "username");
		Label l3=new Label(3, 0, "password");
		Label l4=new Label(0, 1, "chrome");
		Label l5=new Label(1, 1, "http://apps.qaplanet.in/qahrm");
		Label l6=new Label(2, 1, "qaplanet1");
		Label l7=new Label(3, 1,"lab1");
		//For Add  Employe information
		Label L=new Label(0, 0, "FirstName");
		Label L1=new Label(1, 0, "LastName");
		Label L2=new Label(2,0,"Employee Name");
		Label L3=new Label(0, 1,"Maha");
		Label L4=new Label(1, 1,"addala");
		Label L5=new Label(2, 1, "Maha addala");
		//Send data to sheet3
		Label loc=new Label(0, 0, "Name");
		Label Address=new Label(1, 0, "Address");
		Label ZipCode=new Label(2, 0, "ZipCode");
		Label village=new Label(0, 1, "RVP");
		Label State=new Label(1, 1, "AP");
		Label code=new Label(2, 1, "523211");		
		
		sheet.addCell(l);
		sheet.addCell(l1);
		sheet.addCell(l2);
		sheet.addCell(l3);
		sheet.addCell(l4);
		sheet.addCell(l5);
		sheet.addCell(l6);
		sheet.addCell(l7);
		sheet2.addCell(L);
		sheet2.addCell(L1);
		sheet2.addCell(L2);
		sheet2.addCell(L3);
		sheet2.addCell(L4);
		sheet2.addCell(L5);
		sheet3.addCell(loc);
		sheet3.addCell(Address);
		sheet3.addCell(ZipCode);
		sheet3.addCell(State);
		sheet3.addCell(village);
		sheet3.addCell(code);
		
		
		//add cells to sheet
		sheet4.addCell(JobName);
		sheet4.addCell(JobDescription);
		sheet4.addCell(JobTitleName);
		sheet4.addCell(JobDescriptions);
		
		
		wb.write();
		wb.close();
			}
	public void exl(String path) throws Exception, IOException{
		 f1=new File("D:\\OrangeHRM.xls");
		//Load Work BooK
		 wb=Workbook.getWorkbook(f1);
		//TogetSpecific sheet
		 s=wb.getSheet("login");
		  s1=wb.getSheet("Add");
		s2 = wb.getSheet("Location");
		s3=wb.getSheet("JobTitle");
		s4=wb.getSheet("Jobspecification");
		s5=wb.getSheet("Education");
		
		 
	}
	
	public  String ReadDataFromxls(int col,int row) 
	{
		
		String value=s.getCell(col, row).getContents();
		 
		return value;
		
	}
	public String ReadDataFromxlsShee2(int col,int row)
	{
		String value=s1.getCell(col, row).getContents();
	return value;
	}
	public  String ReadDataFromxlsSheet3(int col,int row) 
	{
		
		String value=s2.getCell(col, row).getContents();
		 
		return value;
		
	}
	public  String ReadDataFromxlsSheet4(int col,int row) 
	{
		
		String value=s3.getCell(col, row).getContents();
		 
		return value;
		
	}
	public  String ReadDataFromxlsSheet5(int col,int row) 
	{
		
		String value=s4.getCell(col, row).getContents();
		 
		return value;
		
	}
	
	public  String ReadDataFromxlsSheet6(int col,int row) 
	{
		
		String value=s5.getCell(col, row).getContents();
		 
		return value;
		
	}
	
	


}
