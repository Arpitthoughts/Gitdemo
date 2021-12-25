package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination extends base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browsr_with_chrome() throws Throwable {
       
    	driver=initializeDriver();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logsin$")
    public void user_enters_something_and_something_and_logsin(String strArg1, String strArg2) throws Throwable {
    	LoginPage lp= new LoginPage(driver);
    	lp.getEmail().sendKeys(strArg1);
		lp.getPassword().sendKeys(strArg2);
		lp.getLogin().click();
    }

   

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        driver.get(strArg1);
    }

    
    @And("^Click on login link in homepage to land on secure sign in page$")
    public void click_on_login_link_in_homepage_to_land_on_secure_sign_in_page() throws Throwable {
        
    	LandingPage l=new LandingPage(driver);
    	if(l.getPopupsize()>0) {
    		l.getPopup().click();
    		
    	}
		l.getLogin();
    }
    
    @When("^User enters (.+) and (.+) and logsin$")
    public void user_enters_and_and_logsin(String username, String password) throws Throwable {
    	LoginPage lp= new LoginPage(driver);
    	lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
  
    }


}