package StepActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class csActions {
	
	
	private ChromeDriver chromeDriver;


	public csActions(ChromeDriver chromeDriver) {
		this.chromeDriver = chromeDriver;

		PageFactory.initElements(chromeDriver, this);
	}


	
	
	@FindBy(id="customer-first-name")
	public WebElement first_name;
	
	@FindBy(id="customer-last-name")
	public WebElement last_name;
	
	@FindBy(id="customer-email")
	public WebElement customer_email;
	
	@FindBy(id="customer-password")
	public WebElement customer_pw;
	
	@FindBy(className="link-button")
	public WebElement sign_in;
	
    @FindBy(xpath = "//*[@id=\"login-section\"]/form/button")
    public WebElement create_button;
    
    @FindBy(xpath = "//*[@id=\"login-section\"]/h1")
	public WebElement create_title;
    
    @FindBy(id="modalLabel")
	public WebElement welcome_modal;
    
    @FindBy(xpath = "//*[@id=\"variantListings\"]/div/div/div/div[2]/div[5]/input")
	public WebElement confirmPhone;
	
	@FindBy(id="pink-button")
	public WebElement confirmButton;
	
	@FindBy(xpath = "//*[@id=\"vue-app-account\"]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]")
	public WebElement islandBreezeAddToCart;
	
	@FindBy(className="vs__dropdown-menu")
	public WebElement sizeDropDown;
	
	@FindBy(id="save-button")
	public WebElement saveToCart;
	
    @FindBy(xpath = "//*[@id=\"vue-app-account\"]/div[1]/header/div/div/div[3]/a[3]")
	public WebElement shopButton;
	
	@FindBy(id="email-modal")
	public WebElement mailingEmail;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/div/div/div/div/div[1]/button")
	public WebElement joinBtn;
	
	@FindBy(xpath="/html/body/div[5]/div/div/div/button")
	public WebElement closeSubscribe;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div[3]/div/div/div[1]/a/span/span/picture/img")
	public WebElement whatsNew;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div[1]/div[2]/div/div/div[6]/div/button")
	public WebElement carpetCartButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[3]/div/div[2]/a")
	public WebElement checkOutButton;
	
	@FindBy(xpath="//*[@id=\"one\"]")
	public WebElement deliveryButton;
	
	@FindBy(xpath="//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[2]/input")
	public WebElement addressOne;
	
	@FindBy(xpath="//*[@id=\"locality\"]")
	public WebElement cityAddress;
	
	@FindBy(xpath="//*[@id=\"variantListings\"]/div/div/div/div[2]/div/div[4]/div[3]/input")
	public WebElement zipCodeInput;
	
	@FindBy(id="save-button")
	public WebElement saveAddress;
	
	@FindBy(xpath="//*[@id=\"credit-card\"]")
	public WebElement creditCardRadio;
	
	@FindBy(name="cardnumber")
	public WebElement creditNumber;
	
	@FindBy(name="postal")
	public WebElement creditPostal;
	
	@FindBy(xpath="//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input")
	public WebElement creditExpiration;
	
	@FindBy(xpath="//*[@id=\"root\"]/form/div/div[2]/span[3]/span/span/input")
	public WebElement creditSecurity;
	
	@FindBy(id="stripe-button")
	public WebElement addCard;
	
	@FindBy(className="_cta-button")
	public WebElement payWithCard;
	
	@FindBy(xpath="//*[@id=\"vue-app-checkout-success\"]/div/div/h1")
	public WebElement completeOrderText;
	
	@FindBy(className="webstore-checkout-btn")
	public WebElement continueShopping;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[1]/div/div/div[3]/div/a")
	public WebElement accountIcon;
	
	@FindBy(xpath="//*[@id=\"vue-app-account\"]/div/div[2]/section/div/div[2]/div[2]/div[6]/span")
	public WebElement logoutBtn;
	
	@FindBy(id="email")
	public WebElement loginEmail;
	
	@FindBy(id="password")
	public WebElement loginPassword;
	
	@FindBy(xpath="//*[@id=\"login-section\"]/form/button[2]")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"webstore-cart-wrapper\"]/div[2]/div[2]/section/div[2]/section/div/button")
	public WebElement addCoupon;
	
	@FindBy(xpath="//*[@id=\"variantListings\"]/div/div/div/div[2]/div[2]/input")
	public WebElement couponInput;
		
	@FindBy(id="save-button")
	public WebElement applyCoupon;
	
	public WebElement itemShopped(String itemName) {
	    return chromeDriver.findElement(By.xpath("//*[contains(text(),'"+itemName+"')]"));
    }
	
	
	



	
    
	
	
    
	

	public void verifyAccountPage() {
		Assert.assertEquals("Create Account", create_title.getText());
	}
	
	public void entersFirstLastName(String firstName, String lastName) {
		first_name.sendKeys(firstName);
		last_name.sendKeys(lastName);
	}

	public void emailPassword(String email, String password) {
		customer_email.sendKeys(email);
		customer_pw.sendKeys(password);		
	}
	
	public void customerSubmitsRegistation() {
		create_button.click();
		Assert.assertEquals("Welcome!", welcome_modal.getText());

	}

	public void entersPhoneConfirms(String phoneNumber) {
		confirmPhone.sendKeys(phoneNumber);
		confirmButton.click();
	}

	public void UserSearchsForItemAndAddsToCart(String itemName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		wait.until(ExpectedConditions.visibilityOf(whatsNew));
		whatsNew.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(itemShopped(itemName)));
		itemShopped(itemName).click();
		wait.until(ExpectedConditions.visibilityOf(carpetCartButton));
		carpetCartButton.click();
		wait.until(ExpectedConditions.visibilityOf(carpetCartButton));
		wait.until(ExpectedConditions.visibilityOf(checkOutButton));
		checkOutButton.click();
	}

	public void userJoinsMailingList() throws InterruptedException {
		shopButton.click();
		WebDriverWait wait = new WebDriverWait(chromeDriver, 15);
		wait.until(ExpectedConditions.visibilityOf(closeSubscribe));
		closeSubscribe.click();

	}
	
	public void userEntersAddressInfo(String streetAddress, String cityAddress2, String state, String zipCode2) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		wait.until(ExpectedConditions.visibilityOf(deliveryButton));
		deliveryButton.click();
		wait.until(ExpectedConditions.visibilityOf(addressOne));
		addressOne.sendKeys(streetAddress);
		cityAddress.sendKeys(cityAddress2);
		
		Select stateSelect = new Select((chromeDriver.findElement(By.name("state"))));
		stateSelect.selectByValue(state);
		
		zipCodeInput.sendKeys(zipCode2);
		
		saveAddress.click();

	}
	
	public void userEntersCreditCardInfo(String creditNumber2, String expirationDate, String securityNumber, String zipCode) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 15);
		wait.until(ExpectedConditions.visibilityOf(creditCardRadio));
		creditCardRadio.click();
		Thread.sleep(6000);
		chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//*[@id=\"card-element\"]/div/iframe")));
		wait.until(ExpectedConditions.visibilityOf(creditNumber));
		creditNumber.sendKeys(creditNumber2);
		creditExpiration.sendKeys(expirationDate);
		creditSecurity.sendKeys(securityNumber);
		creditPostal.sendKeys(zipCode);
		chromeDriver.switchTo().defaultContent();
		addCard.click();
	}



	public void userPaysAndVerifies() {
		chromeDriver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		WebDriverWait wait = new WebDriverWait(chromeDriver, 30);
		wait.until(ExpectedConditions.visibilityOf(payWithCard));
		payWithCard.click();
		wait.until(ExpectedConditions.visibilityOf(completeOrderText));
		Assert.assertEquals("Your Order Is Complete!", completeOrderText.getText());
		continueShopping.click();
		wait.until(ExpectedConditions.visibilityOf(accountIcon));
		accountIcon.click();
		wait.until(ExpectedConditions.visibilityOf(logoutBtn));
		logoutBtn.click();
	}
	
	public void userLoginsWithUserNamePassword(String username, String password) {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 30);
		wait.until(ExpectedConditions.visibilityOf(loginEmail));
		loginEmail.sendKeys(username);
		loginPassword.sendKeys(password);
		loginButton.click();
	}
	
	public void userShopsAndAddsItemToCart(String itemName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		wait.until(ExpectedConditions.visibilityOf(shopButton));
		shopButton.click();
		wait.until(ExpectedConditions.visibilityOf(closeSubscribe));
		closeSubscribe.click();
		wait.until(ExpectedConditions.visibilityOf(whatsNew));
		whatsNew.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(itemShopped(itemName)));
		itemShopped(itemName).click();
		wait.until(ExpectedConditions.visibilityOf(carpetCartButton));
		carpetCartButton.click();
		wait.until(ExpectedConditions.visibilityOf(carpetCartButton));
		wait.until(ExpectedConditions.visibilityOf(checkOutButton));
		checkOutButton.click();
	}
	
	public void userEntersCouponCode(String couponCode) {
		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		wait.until(ExpectedConditions.visibilityOf(addCoupon));
		addCoupon.click();
		wait.until(ExpectedConditions.visibilityOf(couponInput));
		couponInput.sendKeys(couponCode);
		applyCoupon.click();
		

		
		
		
	}
	
	

}
