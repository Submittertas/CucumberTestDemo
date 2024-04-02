package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinitions {
	
	@Before
	public void setup()
	{
		System.out.println("Launch Chrome Browser");
		System.out.println("Enter the URL of the application");
	}
	
	
	
	@After
	public void tearDown()
	{
		System.out.println("Close the Browser");
	}
	
	
	
	@Given("user is on Add New Customer page")
	public void user_is_on_add_new_customer_page() 
	{
	    System.out.println("user is on Add New Customer page");
	}

	@When("user fills the customer details")
	public void user_fills_the_customer_details() 
	{
		System.out.println("user fills the customer details");
	}

	@When("click the Add button")
	public void click_the_add_button() 
	{
		System.out.println("click the Add button");
	}

	@Then("customer is added")
	public void customer_is_added() 
	{
		System.out.println("customer is added");
	}

	@Given("the user is on the edit Customer page")
	public void the_user_is_on_the_edit_customer_page() 
	{
		System.out.println("the user is on the edit Customer page");
	}

	@When("user edits the customer details")
	public void user_edits_the_customer_details() 
	{
		System.out.println("user edits the customer details");
	}

	@When("click the Update button")
	public void click_the_update_button() 
	{
		System.out.println("click the Update button");
	}

	@Then("Customer details is updated")
	public void customer_details_is_updated() 
	{
		System.out.println("Customer details is updated");
	}

	@Given("user is on delete customer page")
	public void user_is_on_delete_customer_page() 
	{
		System.out.println("user is on delete customer page");
	}

	@When("user deletes customer")
	public void user_deletes_customer() 
	{
		System.out.println("user deletes customer");
	}

	@Then("customer is deleted")
	public void customer_is_deleted() 
	{
		System.out.println("customer is deleted");
	}

}
