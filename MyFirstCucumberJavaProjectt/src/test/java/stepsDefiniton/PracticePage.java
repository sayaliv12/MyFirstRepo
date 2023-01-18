package stepsDefiniton;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Practice;

public class PracticePage {

	WebDriver driver=null;
	Practice practice;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step-browser is open");
		System.setProperty("webdriver.chrome.driver","D:/Eclipse Workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@And("User is on Practice page")
	public void user_is_on_Practice_page() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		practice=new Practice(driver);
	}
	@When("User clicks on radio2 butoon")
	public void user_clicks_on_radio2_butoon() throws InterruptedException {

		Thread.sleep(3000);
		practice.selectRadioButton();
		practice.enterAndSelectCountryName();
		practice.clickOnOneDropdownItem();
		practice.clickOnOneCheckbox();
	}
	@And("User clicks On both Alert and Confirm button")
	public void user_clicks_On_both_Alert_and_Confirm_button() throws InterruptedException {
		practice.clickOnAlertandConfirmButton();
	}
	@And("User clicks On both Hide and Show button")
	public void user_clicks_On_both_Hide_and_Show_button() {
		practice.clickOnHideAndShowButton();
	}

	@When("User clicks On Mousehover button")
	public void user_clicks_On_Mousehover_button() {
		practice.clickOnMouseHoverButton();
	}
	@And("User selected iframe")
	public void user_selected_iframe() {
		practice.selectiframe();
	}
	@And("User clicks on OpenWindow button")
	public void user_clicks_on_OpenWindow_button() throws InterruptedException {
		practice.clickOnOpenWindowButton();
		String mainPage=driver.getWindowHandle();
		System.out.println(mainPage);

		ArrayList<String> listOfAddr=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(listOfAddr.get(0));
		System.out.println(listOfAddr.get(1));
		driver.switchTo().window(listOfAddr.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		practice.clickOnNoThanksButton();
		driver.switchTo().window(listOfAddr.get(0));
	}
	@And("User clicks on OpenTab button")
	public void user_clicks_on_OpenTab_button() {
		practice.clickOnOpenTabButton();
	}
	@Then("radio button is selected")
	public void radio_button_is_selected() {
		//driver.close();
		//driver.quit();
	}

}
