package JSW.jsw;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checklogin extends BaseClass {

	@Test
	
	public void loginAllpication() {
		// TODO Auto-generated method stub
	//for (int i = 0; i < 20; i++) {
			
		
		
		driver.get("https://los-qa.jofl.co.in/login");
		driver.findElement(By.name("email")).sendKeys("JOFLS032");
		driver.findElement(By.id("password")).sendKeys("Vls@123456");
		driver.findElement(By.id("signInbtn")).click();
		driver.findElement(By.id("otp")).sendKeys("123456");
		
		driver.findElement(By.id("validateOTPbtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Leads/Applications']"))).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add Application']")).click();
		
		WebElement productType = driver.findElement(By.xpath("//div[@class='ui-checkbox ui-checkbox-primary']//select[@id='productId']"));
		wait.until(ExpectedConditions.elementToBeClickable(productType));
		productType.click();
		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-checkbox ui-checkbox-primary']//select[@id='productId']"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText("Customer Onboarding JOFL");
		driver.findElement(By.xpath("//*[@id=\"selectBranchModal\"]/div/div/div[3]/div")).click();
		driver.findElement(By.id("panno")).sendKeys("AANPB0166A");
		
		driver.findElement(By.xpath("//input[@id='applicantname']")).sendKeys("Dash");
		driver.findElement(By.id("primarycontactname")).sendKeys("amit");
		driver.findElement(By.id("contactno")).sendKeys("7710066796");
		driver.findElement(By.xpath("//input[@id='dateofmeeting']")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[11]/div[2]/div[1]/table/tbody/tr[3]/td[5]")).click();
		driver.findElement(By.id("pincode")).sendKeys("400001");
		
			Select lead_Source = new Select(driver.findElement(By.id("leadsource")));
			lead_Source.selectByValue("Direct");
			Select is_this_a_MSME = new Select(driver.findElement(By.id("msmeconcern")));
			is_this_a_MSME.selectByValue("No");
			WebElement companyPan= driver.findElement(By.xpath("//button[normalize-space()='Company PAN de-dupe check']"));
			wait.until(ExpectedConditions.visibilityOf(companyPan));
			companyPan.click();
			//WebElement companyPancompanyPanOK= driver.findElement(By.xpath("//div[@class='swal-button-container']"));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal-button-container']"))).click();
			WebElement element = driver.findElement((By.xpath("//button[normalize-space()='Date of incorporation check']")));

			Actions actions = new Actions(driver);
			actions.moveToElement(element).click().build().perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal-button-container']"))).click();
			WebElement element1 = driver.findElement((By.xpath("//button[normalize-space()='PAN to CIN check']")));

			Actions actions1 = new Actions(driver);
			actions1.moveToElement(element1).click().build().perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal-button-container']"))).click();
			WebElement element2 =driver.findElement(By.id("updateInq"));
			Actions actions2 = new Actions(driver);
			actions2.moveToElement(element2).click().build().perform();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='swal-button-container'])[2]"))).click();
			
			


	}


}