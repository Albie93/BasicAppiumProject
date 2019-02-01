import java.awt.Dimension;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class ScrollingDemo extends Hybrid {

	
	public static void main(String[] args) throws MalformedURLException {
		
		
		
		AndroidDriver<AndroidElement> driver = capabilities("real");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*
		//in case of it is not able to Scroll the use below 
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int x= size.getWidth()/2;
		int starty = (int) (size.getHeight()*0.60);
		int endy = (int) (size.getHeight()*0.10);
		driver.swipe(x,starty,x,endy,2000);
*/
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator( "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
	}
}
