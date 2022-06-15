package com.pageobjectmodule.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	
	public WebDriver driver;

	@FindBy(name = "continue")
	private WebElement bookhotel;
	
	@FindBy(name ="first_name")
	private WebElement firstname;
	
	@FindBy(name = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement adress;
	
	@FindBy(name = "cc_num")
	private WebElement ccnum;
	
	@FindBy(id ="cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(name ="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name ="book_now")
	private WebElement booknow;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public Book_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookhotel() {
		return bookhotel;
	}
	
	
}
