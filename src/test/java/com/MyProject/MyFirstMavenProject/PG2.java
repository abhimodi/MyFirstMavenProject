package com.MyProject.MyFirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PG2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
//		driver.get(baseURL);
//		
//		Select drpCountry = new Select(driver.findElement(By.cssSelector("select[name='country']")));
//		drpCountry.selectByVisibleText("ANTARCTICA");	
//		
		
		//Selecting Items in a Multiple SELECT elements
				driver.get("http://jsbin.com/osebed/2");
				Select fruits = new Select(driver.findElement(By.id("fruits")));
				fruits.selectByVisibleText("Banana");
				fruits.selectByIndex(3);
	}

}
