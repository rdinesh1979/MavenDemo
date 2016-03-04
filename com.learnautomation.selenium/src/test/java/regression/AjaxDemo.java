package regression;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AjaxDemo {

	public static WebDriver driver;
	
	@Test
	public void testAjax() throws Exception
	{
		System.out.println("Testing the Maven Project");
		//ProfilesIni prof = new ProfilesIni();
		//FirefoxProfile fp = prof.getProfile("Dinesh_Firefox");
		//driver = new FirefoxDriver(fp);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.veethi.com/places/india_banks-ifsc-micr-codes.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select bank=new Select(driver.findElement(By.id("selBank")));
		bank.selectByVisibleText("Karur Vysya Bank");
		
		Select state=new Select(driver.findElement(By.id("selState")));
		state.selectByValue("24");
		
		Select city=new Select(driver.findElement(By.id("selCity")));
		city.selectByVisibleText("Chennai");
		
		Select branch=new Select(driver.findElement(By.id("selBranch")));
		branch.selectByVisibleText("Mylapore");
		
		driver.findElement(By.linkText("Find Bank MICR & IFSC Code")).click();
		Thread.sleep(5000l);
		
		driver.quit();
	}
	
	
}
