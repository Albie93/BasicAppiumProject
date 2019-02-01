import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiAutomatortest extends Base {

	
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();//syntax -attribute(Value)
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		// validate clickable feature for all options
		//driver.findElementByAndroidUIAutomator("new Uiselector().property(value)");
		
		//Need to check this Line...this throwing some error
		//System.out.println(driver.findElementsByAndroidUIAutomator("new Uiselector().clickable(false)").size());

		
	}
}
