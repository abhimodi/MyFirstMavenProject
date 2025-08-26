package com.MyProject.MyFirstMavenProject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinksCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver", "D:\\Nikita Modi\\Eclipse Workspace\\MyFirstMavenProject\\driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.iana.org/help/example-domains");

		// Collect all <a> tag links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " +links.size());

		// Check each link
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");

			if(url==null || url.isEmpty())
			{
				System.out.println("Link is empty or not configured properly");
				continue;
			}

			try
			{
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("HEAD");
				connection.connect();

				int responsecode=connection.getResponseCode();
				if(responsecode>=400)
				{
					System.err.println("Broken link: "+url+" status code: "+responsecode);
				}
				else
				{
					System.err.println("Valid link: "+url+" status code: "+responsecode);
				}
			}
			catch (Exception e) {
				System.out.println(url + " --> Exception: " + e.getMessage());
			}
		}
		driver.quit();
	}
}
