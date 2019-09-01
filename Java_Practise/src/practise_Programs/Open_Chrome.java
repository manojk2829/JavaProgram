package practise_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Manoj_Data\\chromedriver\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--start-maximized");
		op.addArguments("--disable-infobars");
		WebDriver dr=new ChromeDriver(op);
		dr.get("http://google.com/");
        dr.quit();		
	}

}
