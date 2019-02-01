import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MisclaneousActions extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getOrientation());
		System.out.println(driver.getContext());
		System.out.println(driver.isDeviceLocked());
		//driver.hideKeyboard();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.HOME);

		
	}

}
