package org.test.newgen.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.amazon.pages.HomePageShopClues;
import org.amazon.pages.ResultPageShopClues;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShopCluesLaunch extends ShopCluesUtils{
	
	public static String url = "https://bazaar.shopclues.com/?mcid=ps&utm_source=google&utm_medium=cpc&utm_campaign=CLUE_7018_adyogi_Brand-Search_Engage&gclid=CjwKCAiAjs2bBhACEiwALTBWZZQhJbgAbPjras7VzVD61smkjiNSDWkpqiGoXUJY7fQiNsIw-PALtxoC-zoQAvD_BwE";
	@Test
	public  void TC001() throws InterruptedException {

		WebDriver driver = launchChromeBrowser(url);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		HomePageShopClues homePageShopElements = new HomePageShopClues(driver);
		homePageShopElements.displayGgdLabel();
		homePageShopElements.enteringTextInSearchBox();
		homePageShopElements.clickSearchButton();
		
		Thread.sleep(2000);
		
		ResultPageShopClues resultPageShopElements = new ResultPageShopClues(driver);
		resultPageShopElements.singleSareeItemDisplay();
		resultPageShopElements.sizeOfListOfSarees();
		//wait.until(ExpectedConditions.invisibilityOf(resultPageShopElements.getSareeItem()));
		
		driver.navigate().back();
		
		homePageShopElements.displayDealLabel();
		
	}

}
