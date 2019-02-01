package com.appium.on.real.device;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class App1 {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID );
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		caps.setCapability( MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		//caps.setCapability(MobileCapabilityType.App, value);
		caps.setCapability("appPackage", "net.one97.paytm");
		//caps.setCapability("appActivity", "net.one97.paytm.hotels2.activity.AJRHotelsHomeActivity");
		caps.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
		//caps.setCapability("appActivity", "net.one97.paytm.AJRMainActivity");


		//caps.setCapability(MobileCapabilityType.APPLICATION_NAME, "net.one97.paytm");
		//caps.setCapability(MobileCapabilityType., value);
		//caps.setCapability(MobileCapabilityType.UDID, "d5bf3496");
		
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);

		
	}
	
}
