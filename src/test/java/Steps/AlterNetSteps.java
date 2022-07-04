package Steps;

import Pages.AlterNetPage;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AlterNetSteps extends CommonMethods {

    @Given("user goes to alternet page")
    public void user_goes_to_alternet_page() {
        openBrowserAndLanuchApplication();
    }

    @Then("logo is visible")
    public void logo_is_visible() {
       Assert.assertTrue(alterNetPage.logo.isDisplayed());

       if (alterNetPage.logo.isDisplayed()){
           System.out.println("Logo is displayed");
       } else {
           System.out.println("There is no logo");
       }
    }

    @Then("Dashboard is displayed")
    public void dashboard_is_displayed(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedTabs = dataTable.asList(); // data from feature
        List<String> actualTabs = new ArrayList<>(); // data from webpage

        for (WebElement ele : alterNetPage.dashboard) {
            actualTabs.add(ele.getText());
        }

        System.out.println(expectedTabs);
        System.out.println(actualTabs);

        Assert.assertEquals(actualTabs,expectedTabs);
    }

    @When("user goes to FAQS page")
    public void user_goes_to_faqs_page() {
        alterNetPage.faqsButton.click();
    }

}
