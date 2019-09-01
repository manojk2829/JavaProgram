package practise_Programs;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Open_Firefox_without_exe {
	@Test
	public void open_Browser_Chrome() throws Exception{
		FirefoxOptions op = new FirefoxOptions(); 
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "Null");
		op.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver dr=new FirefoxDriver(op);
		dr.manage().window().maximize();
		dr.get("http://google.com/");
		wait(5);
        dr.quit();
	}
	
	public void wait(int sec){
		try{
			Thread.sleep(sec*1000);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
