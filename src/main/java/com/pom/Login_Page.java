package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(id = "username")

	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy (id = "login")
	private WebElement login;
	
	public Login_Page(WebDriver home) {
		this.driver = home;
		PageFactory.initElements(home, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
}