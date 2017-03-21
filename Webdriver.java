package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pravallika/Desktop/chromedriver.exe");
WebDriver Driver = new ChromeDriver();
Driver.navigate().to("http://www.gmail.com");
Driver.findElement(By.cssSelector("#Email")).sendKeys("xyz@gmail.com");
Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Driver.findElement(By.cssSelector("#next")).click();
Driver.findElement(By.cssSelector("#link-signup > a")).click();
Driver.findElement(By.cssSelector("#FirstName")).sendKeys("raju");
Driver.findElement(By.cssSelector("#LastName")).sendKeys("klmnr");
Driver.findElement(By.cssSelector("#GmailAddress")).sendKeys("raju.klmnr");
Driver.findElement(By.cssSelector("#Passwd")).sendKeys("SAIram@3");
Driver.findElement(By.cssSelector("#PasswdAgain")).sendKeys("SAIram@3");
	}

}
