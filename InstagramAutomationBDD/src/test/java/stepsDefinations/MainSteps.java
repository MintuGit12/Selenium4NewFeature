package stepsDefinations;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
//	@When("user login into application with {string} and password {string}")
//	public void user_login_into_application_with_and_password(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on practice landing page.........");
	 //   throw new io.cucumber.java.PendingException();
	}
	@When("User signup into application")
	public void user_signup_into_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is displayed");
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	   // throw new io.cucumber.java.PendingException();
	}
	@Given("Setup the entries in database")
	public void setup_the_entries_in_database() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entries setup");
	  //  throw new io.cucumber.java.PendingException();
	}
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("lauching browser....");
	   // throw new io.cucumber.java.PendingException();
	}
	@When("hit the homepage url of banking site")
	public void hit_the_homepage_url_of_banking_site() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hittting the url of homepage");
	    //throw new io.cucumber.java.PendingException();
	}
	@When("^User sign in to application using (.+) and password (.+)$")
	public void user_Sign_In(String un,String pass)
	{
		System.out.println(un+" and password is "+pass);
	}
	@Then("^again fill form (.+) using (.+)$")
	public void again_Fill_Form(String un,String pass)
	{
		System.out.println(un+"---->>"+pass);
	}
	@And("cards are displayed using details")
	public void cards__disp(List<String> details)
	{
		for(int i=0;i<details.size();i++)
		{
			System.out.println(details.get(i));
		}
	}
}
