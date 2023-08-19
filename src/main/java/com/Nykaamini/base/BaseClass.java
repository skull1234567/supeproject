package com.Nykaamini.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	static Actions a;
	static JavascriptExecutor js;
	static Robot r;
	
	public static void launchurl(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
		
	public static boolean elementDisplayed(WebElement element) {
	 boolean display = element.isDisplayed();
	 return display;
		
	}
	
	public static boolean ElementEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	public static void clickonelement(WebElement element) {
		if(elementDisplayed(element)) {
			if(ElementEnabled(element)) {
				element.click();
			}
		}
	}
	
	public static void Sendkeys(WebElement element,String value) {
		if(elementDisplayed(element)) {
			if(ElementEnabled(element)) {
				element.sendKeys(value);
			}
		}
	}

	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\navee\\eclipse-workspace\\CucumberNykaa\\screenshots\\"+filename+".png");
		FileHandler.copy(src, dest);	
		
	}
	
	public static void Mouseactionclick(WebElement element) {
		a = new Actions(driver);
		a.click(element).build().perform();
	}
	
	public static void Mouseactioncontextclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	
	public static void Mouseactionmovetoelement(WebElement element) {
		a = new Actions(driver);

		a.moveToElement(element).build().perform();
	}
	
	public static void Mouseactiondraganddrop(WebElement element,WebElement element1) {
		a = new Actions(driver);
		a.dragAndDrop(element, element1).build().perform();
			
	}
	
	public static void Mouseactiondoubleclick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void jsscrolldown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);",element);
	}
	
	public static void jsscrollup(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);",element);
	}
	
	public static void confirmalert(String Condition) {
		Alert confirmalertt = driver.switchTo().alert();
		
		if(Condition.equalsIgnoreCase("accept")) {
		confirmalertt.accept();
		}
		else if(Condition.equalsIgnoreCase("dismiss")) {
			confirmalertt.dismiss();
		}
	}
	
	public static void simplealert() {
		Alert simplealertt = driver.switchTo().alert();
		simplealertt.accept();
	}
	
	public static void dropdown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if(option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
		else if(option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(option.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
	
	}
	
	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameidorname(String value) {
		driver.switchTo().frame(value);
	}
	public static void elementss(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void windowshandle(String windowid) {
		Set <String> all_id = driver.getWindowHandles();
		for(String id :all_id) {
			System.out.println(id);
			if(id.equals(windowid)) { 
				driver.switchTo().window(id);
			}
		}
	}
	public static void executeJavaScript(String scriptToExecute) {
		 js = (JavascriptExecutor) driver;
		js.executeScript(scriptToExecute);
	}
	
	
	public static void Robott() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
