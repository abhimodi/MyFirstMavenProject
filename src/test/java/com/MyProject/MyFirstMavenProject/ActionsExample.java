package com.MyProject.MyFirstMavenProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		//		String baseURL="https://demo.guru99.com/test/newtours/";
		//		driver.get(baseURL);
		//		
		//		WebElement link_home = driver.findElement(By.linkText("Home"));
		//		WebElement td_home = driver.findElement(By.xpath("//html/body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		//		
		//		Actions builder = new Actions(driver);
		//		Action mouseOverHome = builder.moveToElement(link_home).build();
		//		
		//		String bgColor = td_home.getCssValue("background-color");
		//		System.out.println("Before hover: " + bgColor);
		//		mouseOverHome.perform();
		//
		//		
		//		 bgColor = td_home.getCssValue("background-color");
		//        System.out.println("After hover: " + bgColor);
		//        



		//        String baseUrl2 = "http://www.facebook.com/"; 
		//        driver.get(baseUrl2);
		//        
		//        WebElement txtUsername = driver.findElement(By.id("email"));
		//        Actions builder1 = new Actions(driver);
		//        Action seriesOfActions = builder1.moveToElement(txtUsername).click().keyDown(txtUsername,Keys.SHIFT).sendKeys("hello").keyUp(txtUsername,Keys.SHIFT).doubleClick(txtUsername).contextClick().build();
		//        seriesOfActions.perform();


		String basURL3="https://demo.guru99.com/test/upload/";
		driver.get(basURL3);

		WebElement uploadElement= driver.findElement(By.id("uploadfile_0"));
		//uploadElement.click();
		uploadElement.sendKeys("C:\\Users\\Abhishek Modi\\Documents\\upload.html.txt");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		driver.close();
		
	}

}
