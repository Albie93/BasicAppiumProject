import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybrid {

public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
		
		
		File fs = new File("src");
		File f = new File(fs,"ApiDemos-debug.apk");
		//File f = new File(fs,"Raaga.apk");
 		
		DesiredCapabilities desireCap = new DesiredCapabilities();
		
		if(device.equals("emulator")) {
			
			desireCap.setCapability(MobileCapabilityType.DEVICE_NAME, "NexusDemo2");

			
		}
		else if(device.equals("real")) {
			
			desireCap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");

		}
		
		desireCap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desireCap);
		return driver;
		
	}
	
	
}
