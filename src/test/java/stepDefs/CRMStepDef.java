package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.After;

public class CRMStepDef {
	
	@Given("User is on LoginPage")
	public void user_is_on_loginpage() {
		System.out.println("User is on LoginPage");

	    
	}	
	    
	
	@When("User  view a contact  details")
	public void user_view_a_contact_details() {
		System.out.println("User  view a contact  details");
	    
	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
		System.out.println("User delete a contact");
	    
	}
	
	


}

