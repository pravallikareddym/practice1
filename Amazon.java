package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pravallika/Desktop/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.amazon.com");
	}

}
