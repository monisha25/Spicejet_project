package Testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;
import pom.Flightpage;
import pom.Homelogin;

public class Flightselect extends Basecalssurl{
		
		@Test
		public void testFlightSelection() {
			try {
				//Creating object to Homepage
				Homelogin hp = new Homelogin(driver);
				
				hp.clickOneway(); //Click on OneWay Button
				
				hp.enterOrigin(rb.getString("origin")); //Enter Origin
				
				hp.enterDestination(rb.getString("destination")); //Enter destination
				
				hp.clickDepartureDate(); //Click on departure date
				Thread.sleep(1000);
				
				hp.selectDate(); //Select the date
				
				hp.clickSearchFlight(); //Click on SearchFlight 
				
				//Thread.sleep(2000);
				
				//Creating object to BookingPage
				Flightpage fp = new Flightpage(driver);
				
				fp.verifyModifySearch(); //Verify the Modify Search element 
				Thread.sleep(2000);
				//fp.clickSpiceFlexButton();
				
				//fp.clickFirstFlight();
				
				//fp.clickSpicesaverButton();
				
				//Thread.sleep(1000);
				fp.clickContinue();
				
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}


