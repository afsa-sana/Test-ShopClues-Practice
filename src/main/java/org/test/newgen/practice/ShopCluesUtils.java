package org.test.newgen.practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShopCluesUtils {
	public static WebDriver driver;
	
	public static WebDriver launchChromeBrowser(String appUrl) {
		
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91730\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.get(appUrl);
			 driver.manage().window().maximize();
			 System.out.println("ChromeBrowser successfully Launched");
		}
		catch(Exception e)
		{
			System.out.println("ChromeBrowser unablet to Launch");
			e.printStackTrace();
		}
		 return driver;
	}
	
	public static void elementToBeDisplayed(WebElement elementToDisplay) {
		try
		{
			
			boolean elementdisplay = elementToDisplay.isDisplayed();
			if(elementdisplay==true)
			{
				System.out.println("The "+elementdisplay+" is displayed ");
				Assert.assertTrue(elementdisplay);
			}
			else
			{
				System.out.println("The element is not displayed ");
				Assert.assertTrue(false);
			}
		
		}
		catch(Exception e)
		{
			System.out.println("The element is unable to find");
			e.printStackTrace();
		}
		
	}
	
	public static void typeValue(WebElement elementToType,String valueToType) {

		try
		{
			elementToType.sendKeys(valueToType);
			System.out.println("The "+valueToType+" is texted ");
		}
		catch(Exception e)
		{
			
			System.out.println("The "+valueToType+" is unable to text ");
			e.printStackTrace();
		}
	}
	
	public static void clickTheElement(WebElement elementToClick) {
		try
		{
			elementToClick.click();
			System.out.println("The "+elementToClick+" is clicked ");
		}
		catch(Exception e)
		{
			System.out.println("The "+elementToClick+" is unable to click ");
			e.printStackTrace();
		}
		
	}
	
	public static void clickUsingRobot() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("The Enter Action is performed");
			
		} catch (Exception e) {
			System.out.println("The Enter Action is performed");
			e.printStackTrace();
		}
	}
	
	public static void sizeOfTheListElements(List<WebElement> sizeOfListElement) {
		try
		{
			int sizeOfList = sizeOfListElement.size();
			System.out.println("The Size of the List Of Elements is: "+sizeOfList);
		}
		catch(Exception e)
		{
			System.out.println("The SIze of the List Of Elements is unable to retrieve");
			e.printStackTrace();
		}
	}
	
	
	
}
