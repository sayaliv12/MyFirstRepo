package pages;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;

public class Practice {
	private WebDriver driver;
	private Actions act;


	@FindBy(xpath="//(//button[@class='btn btn-primary'])[2]")
	private WebElement practice;
	@FindBy(xpath="//input[@value='radio2']")
	@CacheLookup
	private WebElement radio2;
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement countryName;
	@FindBy(xpath="(//li[@class='ui-menu-item'])[2]//div")
	private WebElement selectCountry;
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	private WebElement Dropdown;
	@FindBy(xpath="//input[@id='checkBoxOption1']")
	private WebElement Option1;
	@FindBy(xpath="//button[@id='openwindow']")
	private WebElement openWindowButton;
	@FindBy(xpath="//button[text()='NO THANKS']")
	private WebElement noThanks;
	@FindBy(xpath="//a[@id='opentab']")
	private WebElement openTab;
	@FindBy(xpath="//input[@id='alertbtn']")
	private WebElement alertButton;
	@FindBy(xpath="//input[@id='confirmbtn']")
	private WebElement confirmButton;
	@FindBy(xpath="//input[@id='hide-textbox']")
	private WebElement hideButton;
	@FindBy(xpath="//input[@id='show-textbox']")
	private WebElement showButton;
	@FindBy(xpath="//input[@id='displayed-text']")
	private WebElement inputFieldButton;
	@FindBy(xpath="//button[@id='mousehover']")
	private WebElement mouseHoverButton;
	@FindBy(xpath="(//div[@class='mouse-hover-content']//a)[1]")
	private WebElement top;
	@FindBy(xpath="(//div[@class='mouse-hover-content']//a)[2]")
	private WebElement reload;
	@FindBy(xpath="//iframe[@id='courses-iframe']")
	private WebElement iframe;
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement moreMenu;
	@FindBy(xpath="//ul[@class='dropdown-menu']//li[1]")
	private WebElement aboutUs;
	@FindBy(xpath="//ul[@class='dropdown-menu']//li[2]")
	private WebElement partTimeJob;
	@FindBy(xpath="//ul[@class='dropdown-menu']//li[3]")
	private WebElement contactUs;
	
	
			
			
			
	
	








	//public constructor(To initialize)
	public Practice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	//public Methods
	public void selectRadioButton() 
	{
		boolean result=radio2.isSelected();
		System.out.println(result);
		radio2.click();
		result=radio2.isSelected();
		System.out.println(result);
	}
	public void enterAndSelectCountryName()
	{
		countryName.sendKeys("India");
		selectCountry.click();
	}
	public void clickOnOneDropdownItem()
	{
		Select s=new Select(Dropdown);
		s.selectByIndex(1);
	}
	public void clickOnOneCheckbox()
	{
		Option1.click();
	}
	public void clickOnOpenWindowButton()
	{
		openWindowButton.click();
	}
	public void clickOnNoThanksButton()
	{
		noThanks.click();
	}
	public void clickOnOpenTabButton()
	{
		openTab.click();
	}
	public void clickOnAlertandConfirmButton() throws InterruptedException
	{
		alertButton.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		confirmButton.click();
		Thread.sleep(3000);
		alt.dismiss();
	}
	public void clickOnHideAndShowButton()
	{
		boolean result=inputFieldButton.isDisplayed();
		System.out.println(result);
		hideButton.click();
		result=inputFieldButton.isDisplayed();
		System.out.println(result);
		showButton.click();
		result=inputFieldButton.isDisplayed();
		System.out.println(result);
	}
	public void clickOnMouseHoverButton()
	{
		mouseHoverButton.click();
		act.moveToElement(top).click().build().perform();
	}
	public void selectiframe()
	{
		driver.switchTo().frame(iframe);
		
		act.moveToElement(moreMenu).moveToElement(aboutUs).click().build().perform();
		driver.switchTo().defaultContent();
	}
	
	




}
