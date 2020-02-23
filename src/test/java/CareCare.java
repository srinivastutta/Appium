import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CareCare {
	
	static AndroidDriver <WebElement>driver;
	
	@Test
	public static void FillOnBoardingForm() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi");
		cap.setCapability("udid", "0ed6de780404");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0 NRD90M");
		
		cap.setCapability("appPackage", "com.gohidoc.cara");
		cap.setCapability("appActivity", "com.gohidoc.cara.MainActivity");
		//cap.setCapability("autoGrantPermissions", "true");

		//URL of appium Server
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		//Passing URL of appium server and capabilities to driver
		driver = new AndroidDriver<WebElement>(url, cap);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Application started");
		
		//Get Started
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Enter Name
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[96,456][984,642]']")).sendKeys("Srinivas");
		
		Thread.sleep(1000);
		
		//Click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Select Sex
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[730,546][964,775]']")).click();
		
		//Enter Age
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[96,456][984,642]']")).sendKeys("39");
		
		//Click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1122][1080,1296]']")).click();
		
		//Click on Bloating
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,642][518,1021]']")).click();
		
		//Click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Click on IBS
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,762][518,1141]']")).click();
		
		//Click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Scrolling progress Bar
		
		WebElement obj1=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,842][246,935]']"));
		WebElement obj2=driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,873][984,903]']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(obj1).dragAndDrop(obj1, obj2).build().perform();
		
		
		
		//Click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Click on No Button - Treatment
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,627][518,831]']")).click();
		
		//Click on Next Button
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Click on No button - Medication
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[96,723][518,927]']")).click();
		
		//Click on Next Button
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		//Type EMail Address
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[96,696][984,882]']")).sendKeys("srinivas.tutta@gmail.com");
	
		//click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		
		//click on Play Store
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[105,612][975,846]']")).click();
		
		//click on Next
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
		
		
		//click on OK Button
		driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[0,1746][1080,1920]']")).click();
						
			
	}
}
