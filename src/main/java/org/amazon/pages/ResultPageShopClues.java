package org.amazon.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.newgen.practice.ShopCluesUtils;

public class ResultPageShopClues extends ShopCluesUtils{
	
	public ResultPageShopClues(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//h2[text()='Bhuwal Fashion Striped Daily Wear Silk Cotton Blend Sar']")
	private WebElement sareeItem;
	
	@FindBy(xpath="//div[@class='column col3 search_blocks']")
	private List<WebElement> allSareeItems;
	
	
	public void singleSareeItemDisplay() {
		elementToBeDisplayed(sareeItem);
	}
	public void sizeOfListOfSarees() {
		sizeOfTheListElements(allSareeItems);
	}
	
	
	
	
	

	
	
	
	
	
	
}
