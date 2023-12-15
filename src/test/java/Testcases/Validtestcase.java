package Testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;

	import pom.Homelogin;
import pom.Loginpage;

public class Validtestcase  extends Basecalssurl{
		
		@Test(priority=1)
		public void testValidEmailLoginCredentials() {
			
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
				lp.enterPassword(rb.getString("validpassword"));
				
				//Click on Login Button
				lp.clickLogin();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}
		
		@Test(priority=2)
		public void testValidMobileLogin() {
			try {
				Homelogin hp = new Homelogin(driver);
				hp.clickLogin();
				Thread.sleep(1500);
				
				Loginpage lp = new Loginpage(driver);
				
				//Click on mobile button
				lp.clickMobileButton();
				
				//Enter Valid mobile number
				lp.enterMobileNumber(rb.getString("validmobile"));
				
				//Enter Valid Password
				lp.enterPassword(rb.getString("validpassword"));
				
				//Click on Login Button
				lp.clickLogin();
				Thread.sleep(2000);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}


