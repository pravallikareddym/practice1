package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/pravallika/Desktop/chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.navigate().to("http://www.gmail.com");
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String baseUrl = null;
		// Navigate to Gmail 
		Driver.get(baseUrl+"/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		Driver.manage().window().maximize();

		/* Enter username and password */
		//driver.findElement(By.xpath("//a[@id='sign-in']")).click();
		Driver.findElement(By.xpath("//input[@id='Email']")).clear();
		Driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("username");
		Driver.findElement(By.id("next")).click();
		//driver.findElement(By.xpath("//input[@id='Passwd']")).clear();
		Driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("password");
		Driver.findElement(By.xpath("//input[@id='signIn']")).click();

		/*Verify login */
		String title = "Gmail";
		if (Driver.getTitle().contains(title)){
		System.out.println("Logged in sucessfully !!!"+Driver.getTitle());
		}
		else {
		System.out.println("Unable to loggin :-( "+Driver.getTitle());
		}
		/* Compose email */
		Driver.findElement(By.xpath("//div[@class='z0']/div")).click();


		Driver.quit();
		
	}

}
