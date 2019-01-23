package mrc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Upgrade {
ChromeDriver driver;
	
	@BeforeMethod
	public void a() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/oyo/Desktop/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://www.oyoos.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("es_mdd002@oyoproperties.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("oyo@123456");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("div.button-container")).click();
		System.out.println(driver.getTitle());
		driver.getTitle();
	}
	
	   @Test
	   
	   public void precheckin() throws InterruptedException
	   {
		   Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/header[1]/div[1]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("8295050806"); //enter mobile number
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Mukul Gera");  //enter name
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//div[@class='options-selector-option selected']")).click();  //Xpath for twin rooms
			driver.findElement(By.xpath("//div[@class='options-selector-option']")).click();             //Xpath for spain twin rooms
			Thread.sleep(8000);
			//[Add number of adults]
			driver.findElement(By.xpath("//body[@onload='onLoad()']/div[@id='root']/div[@class='appContainer']/div[@id='dashboard']/div[@class='dashboard_container']/div[@class='dashboard_centerBody']/div[@class='dashboard_contentDiv']/div/div[@class='new-bookings-view']/div[@class='new-bookings']/div[@class='section']/div[@class='booking-form']/div[@class='form-input-row']/div[@class='detail-field']/div[@class='room-prices-view']/div[@class='room-categories']/div/div[@class='room-spec-view']/div[@class='room-spec-view-actions']/div[2]/div[3]/*[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[3]/span[1]")).click(); //Click on upgrade button
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).click(); //click on radio button 
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]")).click();
			
			//Checkin
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click(); //Click checkin button
			Thread.sleep(7000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();  //
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			
			
	   }
	   
	   
}

