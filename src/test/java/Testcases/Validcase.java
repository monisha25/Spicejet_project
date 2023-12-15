package Testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

import Baseclass.Basecalssurl;
import pom.Validatepage;

	public class Validcase  extends Basecalssurl{
		
		@Test
		public void testValidation() {
			try {
				
				Validatepage vfp = new Validatepage(driver);
				
				vfp.clickCheckIn();
				Thread.sleep(1000);
				vfp.verifyCheckIn();
				
				vfp.clickFlightStatus();
				Thread.sleep(1000);
				vfp.verifyFightStatus();
				
				vfp.clickManageBooking();
				Thread.sleep(1000);
				vfp.verifyManageBooking();
						
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}



