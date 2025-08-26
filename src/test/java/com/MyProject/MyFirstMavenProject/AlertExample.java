package com.MyProject.MyFirstMavenProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL="https://demo.guru99.com/test/delete_customer.php";
		driver.get(baseURL);
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		
		Thread.sleep(5000);
		
        // Accepting alert		
        alert.accept();	
        alert.accept();	
	}

}
