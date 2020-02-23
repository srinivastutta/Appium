import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class startCalculator {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		try {
			openCalculator();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	
	}

	public static void openCalculator() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "0ed6de780404");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0 NRD90M");
		
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		//cap.setCapability("autoGrantPermissions", "true");

		//URL of appium Server
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		//Passing URL of appium server and capabilities to driver
		driver = new AndroidDriver<WebElement>(url, cap);
		
		System.out.println("Application started");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement two= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/com.miui.support.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[3]"));
		WebElement three= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/com.miui.support.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[3]"));
		WebElement plus= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"plus\"]"));
	
		WebElement equal= driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"equals\"]"));
		
		
		two.click();
		plus.click();
		three.click();
		equal.click();
		
		
	}
	
}
