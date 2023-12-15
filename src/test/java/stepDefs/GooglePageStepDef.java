package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
	}
	@When("User search Java Tutorial")
	public  void user_serach_java_tutorial() {
		WebElement serchbox= driver.findElement(By.cssSelector(".gLFyf"));
		serchbox.sendKeys("Java Tutorial");
		serchbox.submit();
	}

@Then("Should display Java Result Page")
public void should_display_java_result_page() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
}




@When("User search Selenium Tutorial")
public  void user_serach_Selenium_tutorial() {
	WebElement serchbox= driver.findElement(By.id("APjFqb"));
	serchbox.sendKeys("Selenium Tutorial");
	serchbox.submit();
}

@Then("Should display Selenium Result Page")
public void should_display_Selenium_result_page() {
// Write code here that turns the phrase above into concrete actions
Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
}


	
}
