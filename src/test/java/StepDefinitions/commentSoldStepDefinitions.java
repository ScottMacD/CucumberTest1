package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import StepActions.csActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class commentSoldStepDefinitions {
	ChromeDriver chromeDriver;

	csActions commentActions = new csActions(chromeDriver);
	
	csActions csa = new csActions(chromeDriver);		

	
	

	
	@Given("User is on page {string}")
    public void registerPage(String pageUrl) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get(pageUrl);
	}
	
	@And("Verifies they are on the create account page")
    public void verifiesAccountPage() {
		csActions csa = new csActions(chromeDriver);		
		csa.verifyAccountPage();
	}
	
	@And("enters first name as {string} and last name as {string}")
	public void entersFirstLastName(String firstName, String lastName) {
		csActions csa = new csActions(chromeDriver);		
		csa.entersFirstLastName(firstName,  lastName);
	}
	
	@And("enters email address as {string} and password as {string}")
	public void entersEmailPassword(String email, String password) {
		csActions csa = new csActions(chromeDriver);		
		csa.emailPassword(email, password);
	}
	
	@And("customer submits and verifies registration")
	public void customerSubmitsRegistration() {
		csActions csa = new csActions(chromeDriver);		
		csa.customerSubmitsRegistation();
	}
	
	@And("enters phone number as {string} and confirms registation")
	public void entersPhoneConfirms(String phoneNumber) {
		csActions csa = new csActions(chromeDriver);		
		csa.entersPhoneConfirms(phoneNumber);
	}
	
	@And("user clicks add to cart on item {string} and clicks checkout")
	public void userClicksAddToCart(String itemName) throws InterruptedException {
		csActions csa = new csActions(chromeDriver);		
		csa.UserSearchsForItemAndAddsToCart(itemName);
	}
	
	@And("user chooses not to subscribe")
	public void userJoinsMailingList() throws InterruptedException  {
		csActions csa = new csActions(chromeDriver);
		csa.userJoinsMailingList();
	}
	
	@And("user clicks delivery enters the street address as {string} City as {string} State as {string} Zip Code as {string}")
	public void userEntersAddressInfo(String streetAddress, String cityAddress, String state, String zipCode) throws InterruptedException  {
		csActions csa = new csActions(chromeDriver);
		csa.userEntersAddressInfo(streetAddress, cityAddress, state, zipCode);
	}
	
	@And("user enters credit card number as {string} expiration date as {string} and security code as {string} Zip Code as {string}")
	public void userEntersCreditCardInfo(String creditNumber, String expirationDate, String securityNumber, String zipCode) throws InterruptedException  {
		csActions csa = new csActions(chromeDriver);
		csa.userEntersCreditCardInfo(creditNumber, expirationDate, securityNumber, zipCode);
	}
	
	@Then("user pays with card and verifies successful purchase and logs out")
	public void userPaysAndVerifies() throws InterruptedException  {
		csActions csa = new csActions(chromeDriver);
		csa.userPaysAndVerifies();
	}
	
	@And("user shops adds item to cart {string} and clicks checkout")
	public void userShopsAndAddsItemToCartChecksOut(String itemName) throws InterruptedException {
		csActions csa = new csActions(chromeDriver);		
		csa.userShopsAndAddsItemToCart(itemName);
	}
	
	@And("logins with username {string} and password {string}")
	public void userLoginsOnLoginScreen(String username, String password) throws InterruptedException {
		csActions csa = new csActions(chromeDriver);		
		csa.userLoginsWithUserNamePassword(username, password);
	}
	
	@And("user applies coupon code {string}")
	public void userAppliesCouponCode(String couponCode) throws InterruptedException {
		csActions csa = new csActions(chromeDriver);		
		csa.userEntersCouponCode(couponCode);
	}
	
	


}
