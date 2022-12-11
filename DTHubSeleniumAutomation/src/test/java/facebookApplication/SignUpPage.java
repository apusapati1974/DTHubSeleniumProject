package facebookApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/div[1]/form/div[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anudeep");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pusapati");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9014473568");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("$AnudeepTech@123");
		Thread.sleep(3000);
		WebElement datedropdown = driver.findElement(By.id("day"));
		Select s1 = new Select(datedropdown);
		s1.selectByVisibleText("13");
		Thread.sleep(3000);
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select s2 = new Select(monthdropdown);
		s2.selectByVisibleText("Apr");
		Thread.sleep(3000);
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select s3 = new Select(yeardropdown);
		s3.selectByVisibleText("1998");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_1lch']//button[contains(text(),'Sign Up')]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
