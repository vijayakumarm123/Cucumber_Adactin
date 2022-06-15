package com.objectmanager.org;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pageobjectmodule.org.Book_hotel;
import com.pageobjectmodule.org.Loginpage;
import com.pageobjectmodule.org.Logout;
import com.pageobjectmodule.org.Search_Hotel;
import com.pageobjectmodule.org.Select_Hotel;

public class Pageobjectmanager {
	
	public WebDriver driver;
	
	private Loginpage lp;
	
	private Search_Hotel sh;
	
	private Select_Hotel sh1;
	
	private Book_hotel bh;
	
	private Logout lo;
	
	public Pageobjectmanager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Loginpage getLp() {
	  lp = new Loginpage(driver);
		return lp;
	}

	public Search_Hotel getSh() {
		sh = new Search_Hotel(driver);
		return sh;
	}

	public Select_Hotel getSh1() {
		 sh1= new Select_Hotel(driver);
		return sh1;
	}

	public Book_hotel getBh() {
		bh = new Book_hotel(driver);
		return bh;
	}

	public Logout getLo() {
		lo = new Logout(driver);
		return lo;
	}

	

}
