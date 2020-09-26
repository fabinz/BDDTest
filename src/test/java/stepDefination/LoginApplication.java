package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginApplication {
	WebDriver  driver;
	
		@Given("User navigates to demo app login page")
		public void invokeBrowser() {
		  
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\Selenium Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://demo.guru99.com/V4/");
			
		   System.out.println("Navigate");
		}

		
		@When("^User enters user name as (.*)$")
		public void enterUsername(String username) {
			
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(username);
		    System.out.println("Enter username");
		}
		@When("^User enters the pass as (.*)$")
		public void enterPassword(String password) {
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(password);
		    System.out.println("Enter password");
		}
		@When("User clicks login button")
		public void clickLoginButton() {
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		    System.out.println("Click Login");
		}
		@Then("User successfully logins to application")
		public void verifySuccessfulLogin() {
			String expectedTitle = "Guru99 Bank Manager HomePage";
			String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.quit();
			
		 System.out.println("Login Successful");
		}




}
