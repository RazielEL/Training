package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FAQsSteps extends CommonMethods {

    @Then("title is displayed")
    public void title_is_displayed() {
        String title = alterNetPage.title.getText();
        System.out.println(title);
        Assert.assertTrue(alterNetPage.title.isDisplayed());


    }
    @Then("FAQS are displayed")
    public void faqs_are_displayed() {
        String faqs = alterNetPage.faqs.getText();
        System.out.println(faqs);
        Assert.assertTrue(alterNetPage.faqs.isDisplayed());

    }


}
