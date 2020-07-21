package stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {

/*	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("landing on page");
	}

	@When("^user need to enter uername and password$")
	public void user_need_to_enter_uername_and_password() throws Throwable {
		System.out.println("Enter the username and password");
	}


	@When("^user need to enter uername \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_need_to_enter_uername_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		throw new PendingException();
	}


	@And("^click on login buclick on login buttontton$")
	public void click_on_login_button() throws Throwable {
		System.out.println("performed click on login button ");

	}

	@Then("^The user successfully login into application$")
	public void the_user_successfully_login_into_application() throws Throwable {
		System.out.println(" user successfully login into application");
	}

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		// throw new PendingException();
		System.out.println(" user application");
	}

	    @When("^user need to enter uername and password dont have the access$")
    public void user_need_to_enter_uername_and_password_dont_have_the_access() throws Throwable {
       // throw new PendingException();

    	System.out.println(" enter the negative credential");
    }
	

	@When("^user need to enter uername \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_need_to_enter_uername_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		throw new PendingException();
	}


	@Then("^the user not able to login in to application$")
	public void the_user_not_able_to_login_in_to_application() throws Throwable {
		//throw new PendingException();
		System.out.println("not able to login");
	}

	@And("^click on login button up$")
	public void clickupn() throws Throwable {
		// throw new PendingException();
		System.out.println("click button login");
	}*/
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("laning page");
		
	}


	//io.cucumber.junit.UndefinedStepException: The step "The user successfully login into application "true"" is undefined. You can implement it using the snippet(s) below:

		@Then("The user successfully login into application {string}")
		public void the_user_successfully_login_into_application(String string) {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			
			System.out.println("login in to application");
		}



	/*@When("user need to enter uername {string} and password {string}")
	public void user_need_to_enter_uername_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("un and pd");
		
	}*/
	
	 @When("^user need to enter uername \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_need_to_enter_uername_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        //throw new PendingException();
			System.out.println(strArg1);
			System.out.println(strArg2);
	    }
/*	@When("click on login buclick on login buttontton")
	public void click_on_login_buclick_on_login_buttontton() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("login button");
	}*/


		    @And("^click on login buclick on login buttontton$")
		    public void click_on_login_buclick_on_login_buttontton() throws Throwable {
		       // throw new PendingException();
		    	
		    	System.out.println("login button");
		    }
/*
	@Then("The user successfully login into application")
	public void the_user_successfully_login_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("gogged in");
	}*/
		    
		    
		  //  io.cucumber.junit.UndefinedStepException: The step "The user successfully login into application "true"" is undefined. You can implement it using the snippet(s) below:

		    /*	@Then("The user successfully login into application {string}")
		    	public void the_user_successfully_login_into_application(String string) {
		    	    // Write code here that turns the phrase above into concrete actions
		    	    //throw new io.cucumber.java.PendingException();
		    		
		    		System.out.println("user login"
		    				+ "ye");
		    	}*/
		    

		    @Then("^The user successfully  login into application \"([^\"]*)\"$")
		    public void the_user_successfully_login_into_application_something(String strArg1) throws Throwable {
		        //throw new PendingException();
		    	System.out.println(strArg1);
	    		System.out.println("user login"
	    				+ "ye");
		    }


		   // io.cucumber.junit.UndefinedStepException: The step "User is signup page" is undefined. You can implement it using the snippet(s) below:

		    	@Given("User is signup page")
		    	public void user_is_signup_page() {
		    	    // Write code here that turns the phrase above into concrete actions
		    	   // throw new io.cucumber.java.PendingException();
		    		System.out.println("user is signup");
		    	}


		    	//Some other steps were also undefined:

		    	@When("need to enter all the required details for")
		    	public void need_to_enter_all_the_required_details_for(DataTable table) {
		    	    // Write code here that turns the phrase above into concrete actions
		    	    // For automatic transformation, change DataTable to one of
		    	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    	    //
		    	    // For other transformations you can register a DataTableType.
		    	    //throw new io.cucumber.java.PendingException();
		    		List<List<String>> fir=table.asLists();
		    		
		    		System.out.println(fir.get(0).get(0));
		    		System.out.println(fir.get(0).get(1));
		    		
		    		System.out.println(fir.get(0).get(2));
		    		System.out.println(fir.get(0).get(3));
		    	}
		    	@Then("home page is populated")
		    	public void home_page_is_populated() {
		    	    // Write code here that turns the phrase above into concrete actions
		    	   // throw new io.cucumber.java.PendingException();
		    		
		    		
		    		System.out.println("Home page populated");
		    	}



		    //	io.cucumber.junit.UndefinedStepException: The step "user is on the netbanking landing page" is undefined. You can implement it using the snippet(s) below:

		    		@Given("user is on the netbanking landing page")
		    		public void user_is_on_the_netbanking_landing_page() {
		    		    // Write code here that turns the phrase above into concrete actions
		    		    //throw new io.cucumber.java.PendingException();
		    			System.out.println("Netbanking landing page");
		    		}


		    		//Some other steps were also undefined:

		    		@When("user login in to application(.+) and (.+)")
		    		public void user_login_in_to_applicationun1_and_pw1() {
		    		    // Write code here that turns the phrase above into concrete actions
		    		   // throw new io.cucumber.java.PendingException();
		    			
		    			System.out.println("login with different un pwd");
		    		}
		    		@Then("Home page is displayed")
		    		public void home_page_is_displayed() {
		    		    // Write code here that turns the phrase above into concrete actions
		    		   // throw new io.cucumber.java.PendingException();
		    			System.out.println("home page is displayeds");
		    		}



}
