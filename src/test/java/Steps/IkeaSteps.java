package Steps;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IkeaSteps extends CommonMethods{

    @Given("user goes to ikea page")
    public void user_goes_to_ikea_page() {
        openBrowserAndLanuchApplication();
    }

    @When("user search for sofa")
    public void user_search_for_sofa() throws InterruptedException {
        Thread.sleep(5000);
        sendKeys(ikeaPage.searchBox, "sofa");
        getJSE().executeScript("arguments[0].click();",ikeaPage.searchButton);
        Thread.sleep(8000);


    }
    @When("user adds sofa to the cart")
    public void user_adds_sofa_to_the_cart() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)drv;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        getJSE().executeScript("arguments[0].click();",ikeaPage.addToCartSofa);
    }
    @Then("user search for the table")
    public void user_search_for_the_table() throws InterruptedException {
        getJSE().executeScript("window.scrollBy(0,-250)");
        Thread.sleep(5000);
        getJSE().executeScript("arguments[0].click();",ikeaPage.searchBox);
        ikeaPage.clearButton.click();
        Thread.sleep(3000);
        sendKeys(ikeaPage.searchBox, "table");
        getJSE().executeScript("arguments[0].click();",ikeaPage.searchButton);
        Thread.sleep(8000);
        getJSE().executeScript("window.scrollBy(0,250)");
    }
    @Then("user adds table to the cart")
    public void user_adds_table_to_the_cart() throws InterruptedException {
        getJSE().executeScript("arguments[0].click();",ikeaPage.addToCartTable);
        getJSE().executeScript("window.scrollBy(0,-250)");
        Thread.sleep(5000);
    }
    @Then("user goes to the cart")
    public void user_goes_to_the_cart() throws InterruptedException {
        ikeaPage.cartButton.click();
        Thread.sleep(5000);
        getJSE().executeScript("window.scrollBy(0,250)");
    }
    @Then("user verifies number of items in the cart")
    public void user_verifies_number_of_items_in_the_cart() {

        System.out.println(ikeaPage.shoppingCartList.size());
    }
    @Then("user applies the discount code")
    public void user_applies_the_discount_code() throws InterruptedException {
        ikeaPage.discountButton.click();
        sendKeys(ikeaPage.discountBox,"jgkfdirkgjfhdjk" );
        ikeaPage.applyButton.click();
        Thread.sleep(5000);
    }
    @Then("gets error message")
    public void gets_error_message() {
        String error = ikeaPage.errorMessage.getText();
        Assert.assertEquals(error, "You've added an invalid coupon code. Please try again.");
    }

}
