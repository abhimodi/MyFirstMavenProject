package com.MyProject.MyFirstMavenProject;

import java.util.Iterator;		
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL="https://demo.guru99.com/popup.php";
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		String mainwindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> l1=s1.iterator();
		
		while(l1.hasNext())
		{
			String childwinfow = l1.next();
			
			if(!mainwindow.equalsIgnoreCase(childwinfow))
			{
				driver.switchTo().window(childwinfow);
				driver.findElement(By.name("emailid")).sendKeys("nikishinde20@gmail.com");
				 driver.findElement(By.name("btnLogin")).click();			
                 
					// Closing the Child Window.
		                        driver.close();	
			}
		}
		// Switching to Parent window i.e Main Window.
        driver.switchTo().window(mainwindow);
	}
}
