package com.MyProject.MyFirstMavenProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.cssSelector("button[type='submit']");
    By logoutLink = By.cssSelector("a[href='/logout']");

    public  LoginPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isLogoutDisplayed() {
        return driver.findElement(logoutLink).isDisplayed();
    }
}