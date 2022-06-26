package com.pom;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public static WebDriver driver;

	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel sh1;
	private Book_Hotel bh;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_Page getInstanceLP() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Search_Hotel getInstanceSH() {
		sh = new Search_Hotel(driver);
		return sh;
	}

	public Select_Hotel getInstanceSH1() {
		sh1 = new Select_Hotel(driver);
		return sh1;
	}

	public Book_Hotel getInstanceBH() {
		bh = new Book_Hotel(driver);
		return bh;
	}
}
