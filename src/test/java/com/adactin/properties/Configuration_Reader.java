package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p = new Properties();
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\Cucumber_Bdd\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
	
	FileInputStream fi = new FileInputStream(f);
	
	 p = new Properties();
	 
	 p.load(fi);
	 
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		
		return url;
		
	}
	
	public String getusername() {
		
		String username = p.getProperty("username");
		
		return username;
		

	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		
		return password;

	}

}
