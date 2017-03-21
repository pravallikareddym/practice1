package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pravallika/Desktop/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		
	}

}
