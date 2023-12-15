package spicejetautomationproject;


	

	import java.io.File;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	public class utility {
		
		public static WebDriver driver;
		
		public void SwitchWindow() {
			String currentwindow=driver.getWindowHandle();
			Set<String> windowhandles=driver.getWindowHandles();
			windowhandles.size();
			
			for(String childwindow:windowhandles) {
				if(childwindow.contentEquals(currentwindow)) {
					driver.switchTo().window(childwindow);
					break;
				}
			}
		}
		
		public String captureScreenshot(String tname) {
			//tname is method name(testName) for which screenshot to be captured
			
			/*SimpleDateFormat df = new SimpleDateFormat("yyyymmddhhss");
			Date dt= new Date();
			String timeStamp =df.format(dt);*/
			//Above Code is converted into single line code
		String timeStamp = new SimpleDateFormat("yyyymmddhhss").format(new Date());
			
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
			//screenshot captured and stored somewhere, So need to copy into destination folder
			String destination = ".\\screenshots\\"+tname+"_"+timeStamp+".png";
			//String destination = "screenshots/" + System.currentTimeMillis() + ".png";
			
			try {
				FileUtils.copyFile(source, new File(destination));
			} catch(Exception e) {
				e.getMessage();
			}
			return destination;
			
		}

	}


