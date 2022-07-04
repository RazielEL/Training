package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectorHubPagePage extends CommonMethods {

    @FindBy(xpath ="//*[@id=\"userId\"]")
    public WebElement userEmail;

    @FindBy(id = "pass")
    public WebElement userPass;

    @FindBy(xpath = "//*[@id=\"pass\"]")
    public WebElement userCompany;

    @FindBy(xpath= "//*[@id=\"content\"]/div/div[1]/section[2]/div/div[1]/div/div[1]/div/form/div/input[3]")
    public WebElement submitButton;

    @FindBy(id = "inp_val")
    public WebElement firstCrush;

    public SelectorHubPagePage(){
        PageFactory.initElements(drv,this);
    }

}
