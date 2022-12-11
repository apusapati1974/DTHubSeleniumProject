package facebookApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		// UserName or Phone Number 
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("9014473568");
		Thread.sleep(3000);
		// Password
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("$AnudeepTech@123");
		Thread.sleep(3000);
		//Login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(8000);
		driver.quit();
	}
}
