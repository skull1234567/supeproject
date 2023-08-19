package com.Nykaamini.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nykaamini.base.BaseClass;

public class Homepage extends BaseClass {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']")
	private WebElement mombaby;
	
	
	
	@FindBy(xpath = "//a[text()='Baby Powder']")
	private WebElement babypowder;

	public WebElement getMombaby() {
		return mombaby;
	}



	public WebElement getBabypowder() {
		return babypowder;
	}

	
	
	
	    //moving to mom&babyelement
		//WebElement mombaby = driver.findElement(By.xpath("//a[@href='https://www.nykaa.com/sp/mom-and-baby-native/mom-and-baby']"));
		//a.moveToElement(mombaby).build().perform();
	
	//clicking baby powder elemnt or baby powder element
	//WebElement babypowder = driver.findElement(By.xpath("//a[text()='Baby Powder']"));
	//a.contextClick(babypowder).build().perform();
	
	
	

}
