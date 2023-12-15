package pom;


	
	import java.time.Duration;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Homelogin  extends Basepage{

		public Homelogin(WebDriver driver) {
			super(driver);
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//From/ Origin Locator
		@FindBy(xpath="//div[text()='From']")
		WebElement origin;
		
		public void enterOrigin(String str) {
			origin.sendKeys(str);
		}
		
		//Destination Locator
		@FindBy(xpath="(//input[@autocomplete='on'])[2]")
		WebElement destination;
		
		public void enterDestination(String str) {
			destination.sendKeys(str);
		}
		
		//Departure date locator
		@FindBy(xpath="//div[.='Departure Date']")
		WebElement departuredate;
		
		public void clickDepartureDate() {
			
			//js.executeScript("arguments[0].scrollIntoView();", searchflight);
			departuredate.click();
		}
		
		//Select the departure date
		@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-19'])[1]")
		WebElement selectdeparturedate;
		
		@FindBy(xpath="//div[substring-before(text(),'Sep 2023')]")
		WebElement departuredateclick;
		
		public void selectDate() throws Exception {
			departuredateclick.click();
			Thread.sleep(1000);
			selectdeparturedate.click();
		}
		
		//Signup Locator
		@FindBy(xpath="//div[contains(text(),'Signup')]")
		WebElement signup;
		
		public void clickSignup() {
			signup.click();
		}
		
		//Login Locator
		@FindBy(xpath="//div[contains(text(),'Login')]")
		WebElement login;
			
		public void clickLogin() {
			login.click();
		}
		
		//Oneway Button
		@FindBy(xpath="//div[contains(text(),'one way')]")
		WebElement onewaybutton;
		
		public void clickOneway() {
			onewaybutton.click();
		}
		
		//Round Trip Locator
		@FindBy(xpath="//div[contains(text(),'round trip')]")
		WebElement roundtrip;
		
		public void clickRoundTrip() {
			roundtrip.click();
		}
		
		//No.of passengers
		@FindBy(xpath="//div[.='Passengers']")
		WebElement passengers;
		
		public void clickPassengers() {
			passengers.click();
		}
		
		//Search Flight button locator
		@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
		WebElement searchflight;
		
		public void clickSearchFlight() {
			searchflight.click();
		}
		
		//Return Date Locator
		@FindBy(xpath="//div[.='Return Date']")
		WebElement returndate;
		
		public void clickReturnDate() {
			returndate.click();
		}
		
		//Select Return Date
		@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-21'])[1]")
		WebElement selectreturndate;
		
		@FindBy(xpath="//div[contains(text(),'Select Date')]")
		WebElement returndateclick;
		
		public void selectReturnDate() throws Exception {
			returndateclick.click();
			Thread.sleep(1000);
			selectreturndate.click();
		}
		
		//Check-In field locator
		

	}



