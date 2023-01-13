package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.adactin.baseclass.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Login_Page;
import com.pom.Page_Object_Manager;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Runner extends Base_Class {

	public static WebDriver driver = Base_Class.launchbrowser("chrome");

	/*
	 * public static Login_Page lp = new Login_Page(driver); public static
	 * Search_Hotel sh = new Search_Hotel(driver); public static Select_Hotel sh1 =
	 * new Select_Hotel(driver); public static Book_Hotel bh = new
	 * Book_Hotel(driver);
	 */
	public static void main(String[] args) {

		getUrl("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		Page_Object_Manager pom = new Page_Object_Manager(driver);

		InputValue(pom.getInstanceLP().getUsername(), "Chandru12345");

		InputValue(pom.getInstanceLP().getPassword(), "Chandru1$");

		ClickElement(pom.getInstanceLP().getLogin());

		dropDown(pom.getInstanceSH().getLocation(), "byVisibleText", "London");

		dropDown(pom.getInstanceSH().getHotels(), "byVisibleText", "Hotel Sunshine");

		dropDown(pom.getInstanceSH().getRoom_type(), "byVisibleText", "Double");

		dropDown(pom.getInstanceSH().getRoom_nos(), "byVisibleText", "1 - One");

		InputValue(pom.getInstanceSH().getDatepick_in(), "10/04/2022");

		InputValue(pom.getInstanceSH().getDatepick_out(), "15/04/2022");

		dropDown(pom.getInstanceSH().getAdult_room(), "byVisibleText", "2 - Two");

		dropDown(pom.getInstanceSH().getChild_room(), "byVisibleText", "1 - One");

		ClickElement(pom.getInstanceSH().getSubmit());

		ClickElement(pom.getInstanceSH1().getRadiobutton_0());

		ClickElement(pom.getInstanceSH1().getContinue1());

		InputValue(pom.getInstanceBH().getFirst_name(), "Chandrasekaran");

		InputValue(pom.getInstanceBH().getLast_name(), "Kandasamy");

		InputValue(pom.getInstanceBH().getAddress(), "408, 1st Floor, Somu Nagar, Medavakkam, Chennai");

		InputValue(pom.getInstanceBH().getCc_num(), "1234567890000000");

		dropDown(pom.getInstanceBH().getCc_type(), "byVisibleText", "VISA");

		dropDown(pom.getInstanceBH().getCc_exp_month(), "byVisibleText", "September");

		dropDown(pom.getInstanceBH().getCc_exp_year(), "byVisibleText", "2022");

		InputValue(pom.getInstanceBH().getCc_cvv(), "123");

		ClickElement(pom.getInstanceBH().getBook_now());

		driver.close();
		driver.quit();
	}
}