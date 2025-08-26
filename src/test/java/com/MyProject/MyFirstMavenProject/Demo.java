package com.MyProject.MyFirstMavenProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Select select = new Select(driver.findElement(By.id("dropdown")));
		select.selectByVisibleText("Option 1");
		String actualText = select.getFirstSelectedOption().getText();

        // Expected text
        String expectedText = "Option 1";

        // Assert to match expected and actual
        Assert.assertEquals(expectedText, actualText,"expected result:");
		System.out.println("end......");
		//Thread.sleep(30000);
		driver.quit();
	}

}
