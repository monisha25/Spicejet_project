package pom;


	

	import static org.testng.Assert.assertTrue;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Loginpage  extends Basepage{

		public Loginpage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		//Email button Locator
		@FindBy(xpath="//div[text()='Email']")
		WebElement emailbutton;
		
		public void clickEmailButton() {
			emailbutton.click();
		}
		
		
		//mobile number button Locator
		@FindBy(xpath="//div[text()='Mobile Number']")
		WebElement mobilenumberbutton;
		
		public void clickMobileButton() {
			mobilenumberbutton.click();
		}
		
		//Enter email ID Locator
		@FindBy(xpath="//input[@type='email']")
		WebElement email;
		
		public void enterEmail(String str) {
			email.sendKeys(str);
		}
		
		//Enter Password Locator
		@FindBy(xpath="//input[@type='password']")
		WebElement password;
		
		public void enterPassword(String str) {
			password.sendKeys(str);
		}
		
		//Login Button Locator
		@FindBy(xpath="//div[@data-testid='login-cta']")
		WebElement loginbutton;
		
		public void clickLogin() {
			loginbutton.click();
		}
		
		//Inalid email id error message
		@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-2t9rge r-1enofrn r-1bymd8e']")
		WebElement emailerrormessage;
		
		public void verifyEmailErrorMessage() {
			assertTrue(emailerrormessage.isDisplayed());
		}
		
		//Password error message
		@FindBy(xpath="//div[.='Please enter a valid password']")
		WebElement passworderrormessage;
		
		public void verifyPasswordErrorMessage() {
			assertTrue(passworderrormessage.isDisplayed());
		}

		//Mobile number field - Locatot
		@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
		WebElement mobilenumber;
		
		public void enterMobileNumber(String str) {
			mobilenumber.sendKeys(str);
		}
		
		//Verify invalid mobile error message
		@FindBy(xpath="//div[.='Please enter a valid mobile number']")
		WebElement mobileerrormessage;
		
		public void verifyMobileErrorMessage() {
			assertTrue(mobileerrormessage.isDisplayed());
		}
	}



