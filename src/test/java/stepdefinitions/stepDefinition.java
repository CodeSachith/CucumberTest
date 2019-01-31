package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^Suer is on Netbanking landing page$")
    public void suer_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigate to login page");
    }

    @When("^User login into the application with username and passowrd$")
    public void user_login_into_the_application_with_username_and_passowrd() throws Throwable {
    	System.out.println("logged in successfully");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    	System.out.println("validated home page");
    }

   
    
    @When("^User login into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
       
    	System.out.println(strArg1);
    	
    	System.out.println(strArg2);
    }
    
    @Then("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(arg1);
    }


}