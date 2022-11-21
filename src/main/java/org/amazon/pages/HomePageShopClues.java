package org.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.newgen.practice.ShopCluesUtils;

public class HomePageShopClues extends ShopCluesUtils {

	public HomePageShopClues(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='GGD']")
	private WebElement ggdLabel;
	
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement searchBox;
	
	@FindBy(xpath="//h2[contains(text(),'Deals of the Day')]")
	private WebElement dealLabel;
	
	@FindBy(xpath="//a[@class='srch_action btn orange']")
	private WebElement searchButton;
	

	//try
	public void displayGgdLabel() {
		elementToBeDisplayed(ggdLabel);
	}
	public void enteringTextInSearchBox() {
		typeValue(searchBox, "clothes");
	}
	public void clickSearchButton() {
		clickTheElement(searchButton);
		
	}
	public void displayDealLabel() {
		elementToBeDisplayed(dealLabel);
	}
	
	
	

	
	
	
	
	
	
}
