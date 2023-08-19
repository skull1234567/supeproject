package com.Nykaamini.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Nykaamini.base.BaseClass;

public class PageobjectManager extends BaseClass{
	
	public PageobjectManager(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	private Homepage hp;

	public Homepage getHp() {
		hp = new Homepage(driver);
		return hp;
	}
	
	private Babypowdersecond bs;

	public Babypowdersecond getBs() {
		bs = new Babypowdersecond(driver);
		return bs;
	}
	
	private Addtocart add_to_cart;
	
	public Addtocart getAdd_to_cart() {
		add_to_cart = new Addtocart(driver);
		return add_to_cart;
	}
	
	

}
