package Testcases;




	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;
import pom.Homelogin;
import pom.Loginpage;

	public class Invalidcase  extends Basecalssurl{
		
		@Test(priority=1)
		public void testWithInvalidUsername() {
			try {
				Homelogin hp = new Homelogin(driver);
				hp.clickLogin();
				Thread.sleep(1500);
				
				Loginpage lp = new Loginpage(driver);
				
				//Click on email button
				lp.clickEmailButton();
				
				//Enter Valid email ID
				lp.enterEmail(rb.getString("invalidemail"));
				
				//Enter Valid Password
				lp.enterPassword(rb.getString("validpassword"));
				
				//Click on Login Button
				lp.clickLogin();
				
				//Verify email error message
				lp.verifyEmailErrorMessage();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
		
		@Test(priority=2)
		public void testWithInvalidPassword() {
			try {
				Homelogin hp = new Homelogin(driver);
				hp.clickLogin();
				Thread.sleep(1500);
				
				Loginpage lp = new Loginpage(driver);
				
				//Click on email button
				lp.clickEmailButton();
				
				//Enter Valid email ID
				lp.enterEmail(rb.getString("validemail"));
				
				//Enter Valid Password
				lp.enterPassword(rb.getString("invalidpassword"));
				
				//Click on Login Button
				lp.clickLogin();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
		
		@Test(priority=3)
		public void testWithEmptyCredentials() {
			try {
				Homelogin hp = new Homelogin(driver);
				hp.clickLogin();
				Thread.sleep(1500);
				
				Loginpage lp = new Loginpage(driver);
				
				//Click on email button
				lp.clickEmailButton();
				
				//Enter Valid email ID
				lp.enterEmail("");
				
				//Enter Valid Password
				lp.enterPassword("");
				
				//Click on Login Button
				lp.clickLogin();
				
				//Verify the error messages
				lp.verifyEmailErrorMessage();
				//lp.verifyPasswordErrorMessage();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
		
		@Test(priority=4)
		public void testInvalidMobileNumber() {
			try {
				Homelogin hp = new Homelogin(driver);
				hp.clickLogin();
				Thread.sleep(1500);
				
				Loginpage lp = new Loginpage(driver);
				
				//Click on mobile button
				lp.clickMobileButton();
				
				//Enter Valid mobile number
				lp.enterMobileNumber(rb.getString("invalidmobile"));
				
				//Enter Valid Password
				lp.enterPassword(rb.getString("validpassword"));
				
				//Click on Login Button
				lp.clickLogin();
				
				//verify the error message
				lp.verifyMobileErrorMessage();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}


	}



