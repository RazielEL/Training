package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleSteps extends CommonMethods {

    @Given("Admin goes to google page")
    public void admin_goes_to_google_page() {

    }

    @When("Admin sends keys to search bar")
    public void admin_sends_keys_to_search_bar() {
        sendKeys(google.searchBar, "Janusz Maj Zyje");
    }



    @Then("Keys should be sent")
    public void keys_should_be_sent() {
     String verify =  google.searchBar.getText();
     System.out.println(verify);
       // Assert.assertEquals("Janusz Maj Zyje", verify);
    }


}
