package Testcases;




	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;

	
import pom.Homelogin;
import pom.Signuppage;
	

	public class Signupcase  extends Basecalssurl{
		
		/*
		@Test(priority=1)
		public void testSignup() {
			try {
							
				HomePage hp = new HomePage(driver);
				hp.clickSignup();

				Set<String> windowIDs = driver.getWindowHandles();
				List<String> windowIDsList = new ArrayList<String>(windowIDs);
				
				String parentWindow = windowIDsList.get(0);
				String currentWindow = windowIDsList.get(1);
				
				driver.switchTo().window(currentWindow);
				
						Thread.sleep(1500);
				
				// Creating object to SignupPage
				SignupPage sp = new SignupPage(driver);
				
				//Select MR as a Title
				sp.selectTitle(rb.getString("title")); 

				//Enter Firstname
				sp.enterFirstName(rb.getString("firstname")); 
				
				//Enter Lastname
				sp.enterLastName(rb.getString("lastname"));	
				
				//Select INDIA as country
				sp.selectCountry(rb.getString("country"));	
				
				//Enter Date of Birth
				sp.enterDOB(rb.getString("DOB")); 
				
				//Enter mobile number
				sp.enterMobileNumber(rb.getString("mobile")); 
				
				//Enter email ID
				sp.enterEmailID(rb.getString("email"));
				
				//Enter new password
				sp.enterNewPassword(rb.getString("newpassword"));
				
				//Enter Confirm password
				sp.enterConfirmPassword(rb.getString("confirmpassword"));
				
				//Click signIn button
				sp.clickSignin();
				
				Thread.sleep(2000);
				
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
		*/
		@Test(priority=2)
		public void testInvalidSignup() {
			try {
				
				
				Homelogin hp = new Homelogin(driver);
				hp.clickSignup();

				Set<String> windowIDs = driver.getWindowHandles();
				List<String> windowIDsList = new ArrayList<String>(windowIDs);
				
				String parentWindow = windowIDsList.get(0);
				String currentWindow = windowIDsList.get(1);
				
				driver.switchTo().window(currentWindow);
				
						Thread.sleep(1500);
				
				// Creating object to SignupPage
				Signuppage sp = new Signuppage(driver);
				
				//Select MR as a Title
				sp.selectTitle(rb.getString("MS")); 

				//Enter Firstname
				sp.enterFirstName(rb.getString("MONISHA")); 
				
				//Enter Lastname
				sp.enterLastName(rb.getString("Manojkumar"));	
				
				//Select INDIA as country
				sp.selectCountry(rb.getString("India"));	
				
				//Enter Date of Birth
				sp.enterDOB(rb.getString("06/15/1997")); 
				
				//Enter mobile number
				sp.enterMobileNumber(rb.getString("9698018380")); 
				
				//Enter email ID
				sp.enterEmailID(rb.getString("monimanoj7725@gmail.com"));
				
				//Enter new password
				sp.enterNewPassword(rb.getString("Monisha@1234"));
				
				//Enter Confirm password
				sp.enterConfirmPassword(rb.getString("Monisha@1234"));
				
				//Click signIn button
				sp.clickSignin();
				Thread.sleep(1000);
				
				//Verify Error message
				sp.verifyErrorMessage();
				
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}



