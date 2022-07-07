package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class IkeaPage extends CommonMethods {

    @FindBy (xpath = "/html/body/header/div/div/div/div[2]/div/div/form/div[1]/div/input")
    public WebElement searchBox;

    @FindBy (xpath = "/html/body/main/div/div/section[3]/div/div/div[1]/div[3]/div[1]/button")
    public WebElement addToCartSofa;

    @FindBy (xpath = "/html/body/header/div/div/div/ul/li[5]/a/span")
    public  WebElement cartButton;

    @FindBy (xpath = "/html/body/main/div/div/section[3]/div/div/div[1]/div[3]/div[1]/button")
    public WebElement addToCartTable;

    @FindBy (xpath = "//*[@id=\"one-checkout\"]/main/div/div/div/div[19]")
    public WebElement shoppingBagContent;

    @FindBy (xpath = "//*[@id=\"cart-coupon\"]/div[1]/button")
    public WebElement discountButton;

    @FindBy (xpath = "//*[@id=\"discountCode\"]")
    public WebElement discountBox;

    @FindBy (xpath = "//*[@id=\"SEC_cart-coupon\"]/form/div[3]/button/span/span")
    public WebElement applyButton;

    @FindBy (xpath = "//*[@id=\"discount-code__error\"]/span[2]")
    public WebElement errorMessage;

    @FindBy (xpath = "//*[@id=\"search-box__searchbutton\"]")
    public WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"clear-input\"]")
    public WebElement clearButton;

    @FindBy (xpath = "//*[@id=\"one-checkout\"]/main/div/div/div/div[19]/div[2]")
    public List<WebElement> shoppingCartList;


    public IkeaPage(){
        PageFactory.initElements(drv,this);
    }

}
