package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Class;
import com.adactin.runner.Runner_Class;
import com.pom.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Runner_Class.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		InputValue(pom.getInstanceLP().getUsername(), "Chandru12345");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		InputValue(pom.getInstanceLP().getPassword(), "Chandru1$");
	}

	@Then("^user Click The Login Button And it Navigate To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_it_Navigate_To_Search_Hotel_Page() throws Throwable {
		ClickElement(pom.getInstanceLP().getLogin());
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getLocation(), "byVisibleText", "London");
	}

	@When("^user Select The Hotel In Hotels Field$")
	public void user_Select_The_Hotel_In_Hotels_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getHotels(), "byVisibleText", "Hotel Sunshine");
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getRoom_type(), "byVisibleText", "Double");
	}

	@When("^user Select The Rooms In Number of Rooms Field$")
	public void user_Select_The_Rooms_In_Number_of_Rooms_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getRoom_nos(), "byVisibleText", "1 - One");
	}

	@When("^user Choose The In Date In Check In Date Field$")
	public void user_Choose_The_In_Date_In_Check_In_Date_Field() throws Throwable {
		InputValue(pom.getInstanceSH().getDatepick_in(), "10/04/2022");
	}

	@When("^user Choose The Out Date In Check Out Date Field$")
	public void user_Choose_The_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		InputValue(pom.getInstanceSH().getDatepick_out(), "15/04/2022");
	}

	@When("^user Select Adult Room In Adult Per Room Field$")
	public void user_Select_Adult_Room_In_Adult_Per_Room_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getAdult_room(), "byVisibleText", "2 - Two");
	}

	@When("^user Select Child Room In Child Per Room Field$")
	public void user_Select_Child_Room_In_Child_Per_Room_Field() throws Throwable {
		dropDown(pom.getInstanceSH().getChild_room(), "byVisibleText", "1 - One");
	}

	@Then("^user Click The Search Button And it Navigate To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_it_Navigate_To_Select_Hotel_Page() throws Throwable {
		ClickElement(pom.getInstanceSH().getSubmit());
	}

	@When("^user Select The Preferrable Hotel In Select Field$")
	public void user_Select_The_Preferrable_Hotel_In_Select_Field() throws Throwable {
		ClickElement(pom.getInstanceSH1().getRadiobutton_0());
	}

	@Then("^user Click The Continue Button And it Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_it_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		ClickElement(pom.getInstanceSH1().getContinue1());
	}

	@When("^user Enter the First Name In The First Name Field$")
	public void user_Enter_the_First_Name_In_The_First_Name_Field() throws Throwable {
		InputValue(pom.getInstanceBH().getFirst_name(), "Chandrasekaran");
	}

	@When("^user Enter the Last Name In The Last Name Field$")
	public void user_Enter_the_Last_Name_In_The_Last_Name_Field() throws Throwable {
		InputValue(pom.getInstanceBH().getLast_name(), "Kandasamy");
	}

	@When("^user Fill the Address In The Billing Address Field$")
	public void user_Fill_the_Address_In_The_Billing_Address_Field() throws Throwable {
		InputValue(pom.getInstanceBH().getAddress(), "408, 1st Floor, Somu Nagar, Medavakkam, Chennai");
	}

	@When("^user Enter the Card Number In the Credit Card No Field$")
	public void user_Enter_the_Card_Number_In_the_Credit_Card_No_Field() throws Throwable {
		InputValue(pom.getInstanceBH().getCc_num(), "1234567890000000");
	}

	@When("^user Choose the Card Type In the Credit Card Type Field$")
	public void user_Choose_the_Card_Type_In_the_Credit_Card_Type_Field() throws Throwable {
		dropDown(pom.getInstanceBH().getCc_type(), "byVisibleText", "VISA");
	}

	@When("^user Select Month and Year In the Expiry Date Field$")
	public void user_Select_Month_and_Year_In_the_Expiry_Date_Field() throws Throwable {
		dropDown(pom.getInstanceBH().getCc_exp_month(), "byVisibleText", "September");
		dropDown(pom.getInstanceBH().getCc_exp_year(), "byVisibleText", "2022");
	}

	@When("^user Enter the CVV Number In the CVV Number Field$")
	public void user_Enter_the_CVV_Number_In_the_CVV_Number_Field() throws Throwable {
		InputValue(pom.getInstanceBH().getCc_cvv(), "123");
	}

	@Then("^user Click The Book Now Button And it Navigate To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_it_Navigate_To_Booking_Confirmation_Page() throws Throwable {
		ClickElement(pom.getInstanceBH().getBook_now());
	}

	@Then("^user Click Logout Button In The Logout Box$")
	public void user_Click_Logout_Button_In_The_Logout_Box() throws Throwable {
		driver.close();
		driver.quit();
	}

}