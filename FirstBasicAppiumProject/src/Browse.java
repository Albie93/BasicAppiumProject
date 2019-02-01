import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browse extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		/*driver.get("https://facebook.com");
		
		driver.findElementById("m_login_email").sendKeys("ABCD");
		driver.findElementById("m_login_password").sendKeys("abcd");
		driver.findElementByXPath("//button[@value='Log In']").click();
		
		*/
		
		//Validating Scrolling Functionalities
		driver.get("https://cricbuzz.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,780)", "");
		WebElement element = driver.findElementByXPath("//h4[text()='Player Search']");
		js.executeScript("argument[0].scrollIntoView(true);",element);
		
		Assert.assertTrue(driver.findElementByXPath("//h4[text()='Player Search']").getAttribute("class").contains("header"));
		
	}
	
}
