package Testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;
import pom.Addonpage;
import pom.Flightpage;
import pom.Homelogin;
import pom.Passangerspage;
import pom.Paymentpage;

	public class Payment  extends Basecalssurl{
		
		@Test
		public void testFlightBooking() {
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
				
				fp.clickContinue();// click on continue on Flights page
				
				Passangerspage pp = new Passangerspage(driver);
				
				Thread.sleep(2000);
				pp.verifyTripSummary(); //Verify the page
				
				
				//Enter Contact Details
				pp.enterFirstName(rb.getString("ppfirstname")); 
				
				pp.enterLastname(rb.getString("pplastname"));
				
				pp.enterMobileNumber(rb.getString("ppcontactnumber"));
				
				pp.enterEmail(rb.getString("ppemail"));
				
				pp.enterCityName(rb.getString("ppcity"));
				
				pp.clickPrimaryPassengerCheckBox();
				Thread.sleep(1000);
				
				pp.clickContinue();   
				Thread.sleep(2000);
				
				Addonpage ap =new Addonpage(driver);
				
				ap.clickContinue();
				Thread.sleep(2000);
				
				
				Paymentpage paypage = new Paymentpage(driver);
				
				paypage.verifyPaymentsPage();
				
				//Enter Card details to do payment
				//In each input, driver focus switched to inside frame & again switched to default 
				//Switching frames are accommodated in each method declared in page objects repository
				paypage.enterCardNumber(rb.getString("cardnumber")); 
				//here i enterd card details
				paypage.enterNameOnCard(rb.getString("cardholdername"));
				
				paypage.enterCardExpiryMonth(rb.getString("cardexpirymonth"));
				
				paypage.enterCardExpiryYear(rb.getString("cardexpiryyear"));
				
				paypage.enterCardCVV(rb.getString("cardCVV"));
				
				
				//paypage.clickPaymentTnC();
				
				paypage.clickProceedToPay();
				Thread.sleep(2000);
				
				paypage.verifyPaymentFailure();
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}



