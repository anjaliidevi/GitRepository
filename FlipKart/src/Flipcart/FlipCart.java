package Flipcart;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCart {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAP26\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	// To maximize the window
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,60);
	// To open url
	driver.get("http://www.flipkart.com/");
//	WebElement close=driver.findElement(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']"));
	WebElement close = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='_3Njdz7']/button[@class='_2AkmmA _29YdH8']")));
	close.click();
	
	//Focus on electronics
	Actions A=new Actions(driver);
	//move to Electronics
//	WebElement Electronics=driver.findElement(By.className("_1QZ6fC"));
	WebElement Electronics = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("_1QZ6fC")));
	A.moveToElement(Electronics).perform();
	Thread.sleep(1000);
	
	//click on samsung
	WebElement samsung=driver.findElement(By.xpath("//li[@class='_1KCOnI']/a"));
	A.moveToElement(samsung).perform();
	samsung.click();
	Thread.sleep(3000);	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._2AkmmA._1eFTEo>span")));
	WebElement view = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._2AkmmA._1eFTEo>span")));
	view.click();
//click on Price Higt to low
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Price -- High to Low')]"))).click();
	FileOutputStream  fos = new FileOutputStream("C:\\Users\\QAP26\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("sheet1");
	       XSSFRow row = sheet.createRow(0);
	      row.createCell(0).setCellValue("Mobiles");
	      row.createCell(1).setCellValue("Price");
	      
	
	
	      List<WebElement> list=driver.findElements(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/a/div[1]//following::div[@class='_3wU53n']"));
           System.out.println(list.size());
int rc = driver.findElements(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div")).size();
	
	System.out.println(rc);
	

	for(int j=2;j<=18;j++)         // first page data.....
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div["+j+"]/div/div/div/a/div[2]/div[1]/div[1]")));
	    String mobilename = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div["+j+"]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
	   System.out.println(mobilename);
        String mobileprice = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div["+j+"]/div/div/div/a/div[2]/div[2]/div[1]/div/div")).getText();
        System.out.println(mobileprice);
          for(int k=1;k<=18;k++)
             { 
        	      XSSFRow row1 = sheet.createRow(k);
    	          row1.createCell(0).setCellValue(mobilename);
    	          row1.createCell(1).setCellValue(mobileprice);
             }
	
	}
	
	wb.write(fos);
	

}
}
