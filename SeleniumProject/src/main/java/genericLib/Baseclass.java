package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements Autoconstant{
	public WebDriver driver;
	public PropertyFiledata p=new PropertyFiledata();
	public Photo p1=new Photo();
	public Utilities u=new Utilities();
	
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException {
	System.setProperty(key, value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getdata("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
}
 
	@AfterMethod
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
		p1.getphoto(driver,name);
		
		}
		driver.quit();
	}
} 
  
  

