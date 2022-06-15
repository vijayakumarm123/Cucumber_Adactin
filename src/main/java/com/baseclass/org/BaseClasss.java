package com.baseclass.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClasss {
	public static WebDriver driver;
	public static String value;
	
	public static  WebDriver getbrower(String type) {  //1
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\eclipse-workspace\\Cucumber_Bdd\\driver\\chromedriver.exe");
					
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	public static void getUrl(String url) throws Throwable {
		try {
			driver.get(url);
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();

		}
	}
	
	public static WebDriver close() {		//3
		driver.close();
		return driver;
	}
	
	public static void quit() {				//4
		driver.quit();
	}
	
	public static void clickon(WebElement element) {		//5
		element.click();
		}
	
	public static void Buttonss(WebElement element,String value) {		//6
		element.sendKeys(value);

	}
	
	public static WebDriver navigateto(String url) {		//7
		driver.navigate().to(url);
		return driver;	
	}
	
	public static WebDriver refresh() {				//8
		driver.navigate().refresh();
    return driver;
	}
	
	public static WebDriver back() {		//9
		driver.navigate().back();
		return driver;
	}
	
	public static WebDriver forward() { 	//10
		driver.navigate().forward();
	return driver;
	}
	
	public static void alert(String acceptordismiss,String sendkeys) {   //11
		Alert alt = driver.switchTo().alert();
		if (acceptordismiss.equalsIgnoreCase("accept")) {
			
			   alt.accept();	
		}
		else if (acceptordismiss.equalsIgnoreCase("dismiss")) {
			alt.dismiss();
		}
		else if (acceptordismiss.equalsIgnoreCase("sendkeys")) {
			alt.sendKeys(sendkeys);
			alt.accept();
		}
	}
	
public static void frame(String enterorexit, int frameindex) {   //12
   if(enterorexit.equalsIgnoreCase("enter")) {
	   
	   driver.switchTo().frame(frameindex);   
   }
   else if (enterorexit.equalsIgnoreCase("exit")) {
	   driver.switchTo().defaultContent();
   }  
}
	public static WebDriver robot(int buttons) throws AWTException {  //13
		Robot key = new Robot();
		key.keyPress(buttons);
		key.keyRelease(buttons);
		return driver;
	}
	
	public static void windowhandle(String first) {			//14
		Set<String> multiwindow = driver.getWindowHandles();
		if (first.equalsIgnoreCase("first")) {
		
		for (String firstwindow : multiwindow) {
			driver.switchTo().window(firstwindow);
		}
		}
		else if (first.equalsIgnoreCase("second")) {
	//		Set<String> multiwindow = driver.getWindowHandles();
			for (String secondwindow : multiwindow) {
				driver.switchTo().window(secondwindow);
		}
		}	
	}
	
	public static void dropdown(WebElement element,String type,String value) {   //15
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byindex")) {
		int data = Integer.parseInt(value);
		s.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static void checkbox(WebElement element) {			//16
		element.click();
	}
	
	public static void isenable(WebElement element) {
		if(element.isEnabled()) {
			System.out.println("this button is enable"+element);
		}
		else {
			System.out.println("this button is not enabled : "+element);
		}
	}
	
	
	public static void isdisplayed(WebElement element) {		//17
		if(element.isDisplayed()) {
			System.out.println("this button is displayed"+element);
		}
		else  {
			System.out.println("this button is not displayed : "+element);
		}
	}
	
	public static void isselected(WebElement element) {			//18
		if (element.isSelected()) {
			System.out.println("this element is selected : "+element);
		}
		else {
			System.out.println("this element is not selected : "+element);
		}
	}
	
	public static void gettitle() {			//19
		String title = driver.getTitle();
		System.out.println("Tittle : "+title);

	}
	
	public static void getcurrenturl() {	//20
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the current url is : "+currentUrl);	
	}
	
	public static void gettext(WebElement element) {	//21
		String text = element.getText();
		System.out.println("text : "+text);
	}
	
	public static void getattribute(WebElement element, String tagname) {		//22
		String attribute = element.getAttribute(tagname);
		System.out.println("the Attribute values : "+attribute);
	}
	
	public static void implicitytime(int sec,TimeUnit timeunit) {			//23
		driver.manage().timeouts().implicitlyWait(sec, timeunit);
	}
	
	public static void explicitytime(int seconds,WebElement element) {		//24
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void takescreenshot(String path) throws IOException {		//25
		TakesScreenshot ss =(TakesScreenshot) driver;
	      File source =ss.getScreenshotAs(OutputType.FILE);
	      File destination = new File("C:\\Users\\vijay\\OneDrive\\Desktop\\Selenium screenshot\\"+path+".png");
	      FileHandler.copy(source, destination);
	}
	
	public static void scroll(String x,String y) {			//26
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(x,y);
	//	js.executeScript("window.scrollBy(0,250)");
	//	js.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	public static void radiobutton(WebElement element) {			//27
	element.click();
	}
	
	public static void getoptions(WebElement element) {			//28
		Select sc = new Select(element);
		List<WebElement> options = sc.getOptions();
		int size = options.size();
		for(int i =0;i<size;i++) {
			String text2 = options.get(i).getText();
			System.out.println(" all optins text :"+text2);
		}
	}
	
	public static void getfirstselectedoption(WebElement element) {		//29
		Select sc=new Select(element);
		WebElement firstSelectedOption = sc.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("the first selected option text is : "+text);
	}
	
	public static void ismultiple(WebElement element) {			//30
		Select sc=new Select(element);System.out.println();
		boolean multiple = sc.isMultiple();
		System.out.println("is multiple : "+multiple);
	}
	
	public static void actions(String method,WebElement element,WebElement element2) {	//31
		Actions act = new Actions(driver);
		if(method.equalsIgnoreCase("draganddrop")) {
			act.dragAndDrop(element, element2).build().perform();
		}
		else if (method.equalsIgnoreCase("moveelement")) {
			act.moveToElement(element).build().perform();
			act.click(element2).build().perform();	
		}
		else if (method.equalsIgnoreCase("clickandhold")) {
			act.clickAndHold(element).build().perform();
			act.moveToElement(element2).build().perform();
		}
		else if (method.equalsIgnoreCase("doubleclick")) {
			act.doubleClick().build().perform();
		}

	}
	
}
