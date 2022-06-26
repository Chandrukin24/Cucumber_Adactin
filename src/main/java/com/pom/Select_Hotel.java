package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(id = "continue")
	private WebElement continue1;

	public Select_Hotel(WebDriver selecthotel) {
		this.driver = selecthotel;
		PageFactory.initElements(selecthotel, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinue1() {
		return continue1;
	}

}
