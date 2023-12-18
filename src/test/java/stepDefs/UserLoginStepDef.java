package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	
		WebDriver driver;
		@Given("User is on Login Page")
		public void user_is_on_login_page() {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.manage().window().maximize();
			
			
			
			
		}
		@When("User enters  {string}  and {string}")
		public void user_enters_and(String struser, String strPwd) {
		   driver.get("https://the-internet.herokuapp.com/login");
		   driver.findElement(By.id("username")).sendKeys("tomsmith");
		   driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		   driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
		   
		   
		}

	@Then("Should display Success Msg")
	public void should_display_Success_Msg() {
	    // Write code here that turns the phrase above into concrete actions
		boolean isDisp=driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	   	}




	



}
