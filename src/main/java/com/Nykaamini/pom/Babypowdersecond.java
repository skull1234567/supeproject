package com.Nykaamini.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nykaamini.base.BaseClass;

public class Babypowdersecond extends BaseClass{
		

	WebDriver driver;
	public Babypowdersecond(WebDriver driver) {
	
		this.driver = driver;
	
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "(//img[@class='css-11gn9r6'])[1]")
	private WebElement babypowderclick;
	
	public WebElement getBabypowderclick() {
		return babypowderclick;
	}
	
	
	
	//to click the baby powder in the second tab
	//driver.findElement(By.xpath("(//img[@class='css-11gn9r6'])[1]")).click();
			
	
	
}
