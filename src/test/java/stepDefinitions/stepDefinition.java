package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Navigated to landing page");
    }

    
    @When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated home page");
        
    }

    @Then("^Cards displayed \"([^\"]*)\"$")
    public void cards_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }
        
    

}