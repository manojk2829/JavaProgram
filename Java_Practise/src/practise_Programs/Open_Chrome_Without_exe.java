package practise_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Open_Chrome_Without_exe {
	
	@Test
	public void open_Browser_Chrome(){
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--disable-infobars");
		WebDriver dr=new ChromeDriver(op);
		dr.get("http://google.com/");
        dr.quit();
	}
}
