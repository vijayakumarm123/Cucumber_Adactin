package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.properties.File_Reader_Manager;
import com.adactin.runner.RunnerClass;
import com.baseclass.org.BaseClasss;
import com.objectmanager.org.Pageobjectmanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClasss{
	
	
	
	public static WebDriver driver= RunnerClass.driver;
	
	public static Pageobjectmanager po = new Pageobjectmanager(driver);
	
	
		@Given("^user Launch The Application$")
		public void user_Launch_The_Application() throws Throwable {
			
			String url = File_Reader_Manager.getinstance().getinstaceCR().geturl();	
			getUrl(url);
		    
		}

		@When("^user Enter The Username In Username Field$")
		public void user_Enter_The_Username_In_Username_Field() throws Throwable {
			String username = File_Reader_Manager.getinstance().getinstaceCR().getusername();
			Buttonss(po.getLp().getEmail(), username);
			
		}

		@When("^user Enter The Password In Password Field$")
		public void user_Enter_The_Password_In_Password_Field() throws Throwable {
			
			String password = File_Reader_Manager.getinstance().getinstaceCR().getpassword();
		 Buttonss(po.getLp().getPassword(), password);
		}

		@Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
		public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		 clickon(po.getLp().getSubmit());  
		}

		@When("^user Select The Hotel Location In The Dropdown$")
		public void user_Select_The_Hotel_Location_In_The_Dropdown() throws Throwable {
		    dropdown(po.getSh().getLocation(), "byvisibletext", "London");
		}

		@When("^user Select The Hotel In Hotels Dropdown$")
		public void user_Select_The_Hotel_In_Hotels_Dropdown() throws Throwable {
			dropdown(po.getSh().getHotel(), "byvisibletext", "Hotel Sunshine");
		}

		@When("^user Select The Room Type In The Dropdown$")
		public void user_Select_The_Room_Type_In_The_Dropdown() throws Throwable {
			dropdown(po.getSh().getRoomtype(), "byvisibletext", "Double");
		}

		@When("^user Select The Number Of Rooms In The Dropdown$")
		public void user_Select_The_Number_Of_Rooms_In_The_Dropdown() throws Throwable {
			dropdown(po.getSh().getRoomnos(), "byvisibletext", "3 - Three");
		}

		@When("^user Enter The InDate In Check In Date Field$")
		public void user_Enter_The_InDate_In_Check_In_Date_Field() throws Throwable {
			
			Buttonss(po.getSh().getIndate(), "23/05/2022");
		}

		@When("^user Enter THe OutDate In  Check Out Date Field$")
		public void user_Enter_THe_OutDate_In_Check_Out_Date_Field() throws Throwable {
			
			Buttonss(po.getSh().getOutdate(), "31/05/2022");
		}

		@When("^user Choose The Adults Per Room In The Dropdown$")
		public void user_Choose_The_Adults_Per_Room_In_The_Dropdown() throws Throwable {
			
			dropdown(po.getSh().getAdult(), "byvalue", "3");
		}

		@When("^user Choose The Children per In The Dropdown$")
		public void user_Choose_The_Children_per_In_The_Dropdown() throws Throwable {
			
			dropdown(po.getSh().getChild(), "byvalue", "2");
		}

		@Then("^user Click The Search Button And Its Navigate To The Select Hotel Page$")
		public void user_Click_The_Search_Button_And_Its_Navigate_To_The_Select_Hotel_Page() throws Throwable {
			
			clickon(po.getSh().getSubmit());
		}

		@When("^user Click The Radio Button In The Sleect Hotel$")
		public void user_Click_The_Radio_Button_In_The_Sleect_Hotel() throws Throwable {
			
			clickon(po.getSh1().getSelecthotel());
		}

		@Then("^User Click The Continue Button And It Navigate To The Book Hotel Page$")
		public void user_Click_The_Continue_Button_And_It_Navigate_To_The_Book_Hotel_Page() throws Throwable {
			clickon(po.getBh().getBookhotel());
		}

		@When("^user Enter The First Name In The First Name Field$")
		public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
			Buttonss(po.getBh().getFirstname(), "vijayakumar");
		}

		@When("^user Enter The Last Name In The Last Name Field$")
		public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
			Buttonss(po.getBh().getLastname(), "M");
		}

		@When("^user Enter The Address In The Address Field$")
		public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
			Buttonss(po.getBh().getAdress(), "no.2 - greenstechnology,singapoore.");
		}

		@When("^user Enter The Credit Card Number In The Credit Card Field$")
		public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Field() throws Throwable {
			Buttonss(po.getBh().getCcnum(), "7890 4321 4567 6789");
		}

		@When("^user Select The Credit Card Type In The Dropdown$")
		public void user_Select_The_Credit_Card_Type_In_The_Dropdown() throws Throwable {
			dropdown(po.getBh().getCctype(), "byindex", "1");
		}

		@When("^user Select The Expire Month In The Dropdown$")
		public void user_Select_The_Expire_Month_In_The_Dropdown() throws Throwable {
			dropdown(po.getBh().getExpmonth(), "byvisibletext", "March");
		}

		@When("^user Select The Expire Year In The Dropdown$")
		public void user_Select_The_Expire_Year_In_The_Dropdown() throws Throwable {
			dropdown(po.getBh().getExpyear(), "byvisibletext", "2014");
		}

		@When("^user Enter The Cvv Number In The Cvv Number Field$")
		public void user_Enter_The_Cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
			Buttonss(po.getBh().getCvv(), "123");
		}

		@Then("^user Click The Booknow Button And It Navigate The Booking Conformation Page$")
		public void user_Click_The_Booknow_Button_And_It_Navigate_The_Booking_Conformation_Page() throws Throwable {
		    clickon(po.getBh().getBooknow());
		}

		@Then("^user Click The Logout Button And It Will Navigate To The Next Page And Show The Message You Have Successfully Logged Out$")
		public void user_Click_The_Logout_Button_And_It_Will_Navigate_To_The_Next_Page_And_Show_The_Message_You_Have_Successfully_Logged_Out() throws Throwable {
		
			clickon(po.getLo().getLogout());
		}
	
	


}
