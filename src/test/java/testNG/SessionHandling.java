package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHandling {

	
	
	 
	 @Test    
	    public void executSessionOne(){
	            //First session of WebDriver
	        System.setProperty("webdriver.chrome.driver","D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("https://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            
	        }
	        
	    @Test    
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("https://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        
	        }
	        
	    @Test    
	        public void executSessionThree(){
	            //Third session of WebDriver
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("https://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        
	        }   

}
