package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SelectorsHubSteps extends CommonMethods{

    @Given("Admin goes to SH page")
    public void admin_goes_to_sh_page() {
        openBrowserAndLanuchApplication();
    }

    @When("Admin sends keys")
    public void admin_sends_keys() {
        sendKeys(selectorHubPage.userEmail, "januszmaj@gmail.com");
        sendKeys(selectorHubPage.userPass, "jebiewdenko");
        sendKeys(selectorHubPage.userCompany, "DrownZone");
    }

    @Then("Keys should be sent and displayed")
    public void keys_should_be_sent_and_displayed() {
        Assert.assertTrue(selectorHubPage.userEmail.isDisplayed());
        Assert.assertTrue(selectorHubPage.userCompany.isDisplayed());
    }



}
