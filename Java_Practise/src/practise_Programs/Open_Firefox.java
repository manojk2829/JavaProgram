package practise_Programs;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Open_Firefox {
	public WebDriver dr;
	public FirefoxOptions op;
	
	@Test
	public void open_Firefox(){
		System.setProperty("webdriver.gecko.driver", "C:\\Manoj_Data\\geckodriver\\geckodriver.exe");
		op = new FirefoxOptions(); 
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "Null");
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		dr=new FirefoxDriver(op);
		dr.manage().window().maximize();
		dr.get("http://google.com/");		
        dr.quit();
	}
}
