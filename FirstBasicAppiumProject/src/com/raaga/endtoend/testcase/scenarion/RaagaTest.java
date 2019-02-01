package com.raaga.endtoend.testcase.scenarion;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class RaagaTest extends Base {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElementById("com.raaga.android:id/skip_btn").click();
		driver.findElementById("android:id/button2").click();
		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(2000);
		Point p = driver.findElementById("com.raaga.androiµd:id/skip_login_btn").getLocation();
		p.x = p.getX();
		p.y = p.getY();
		
		driver.findElementById("com.raaga.android:id/skip_login_btn").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		//Thread.sleep(2000);
		//.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();


	}

}
