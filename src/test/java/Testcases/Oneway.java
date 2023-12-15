package Testcases;




	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;
import pom.Flightpage;
import pom.Homelogin;

	 public class Oneway extends Basecalssurl{

		@Test
		public void onewaySearchFlight() {
			try {
				
				//Creating object to Homelogin
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
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
			
		}
	}


