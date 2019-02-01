import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Basics extends Hybrid {

	
	public static void main(String[] args) throws MalformedURLException {
		
		//AndroidDriver<AndroidElement> driver = capabilities("real");
		AndroidDriver<AndroidElement> driver = capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementById("android:id/edit").sendKeys("Amit");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();

		
		
		
		
		

		
		
		
		
	}
	
	
}
