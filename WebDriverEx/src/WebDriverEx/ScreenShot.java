package WebDriverEx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShot {
	public static void main(String[] args) throws Exception {
		
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\QAP29\\Downloads\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 driver.findElement(By.id("email")).clear();
	 driver.findElement(By.id("email")).sendKeys("Mahalakshmi");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source=ts.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(source, new File("./Screenshot/Facebook.png"));
	 System.out.println("ScreenshotTaken");
	 driver.close();
	 driver.quit(); 
	 }
	}


