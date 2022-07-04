package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlterNetPage extends CommonMethods {

    @FindBy (xpath = "//*[@id=\"sTop_Bar_0_0_10_0_0_8_0_0_0\"]/a/img[3]")
    public WebElement logo;

    @FindBy (xpath = "/html/body/div[5]/div/div[7]/ul/li" )
    public List<WebElement> dashboard;

    @FindBy (xpath = "//*[@id=\"col-center\"]/div/h1/a")
    public WebElement title;

    @FindBy (xpath = "//*[@id=\"col-center\"]/div/div[2]/div")
    public WebElement faqs;

    @FindBy (xpath = "/html/body/div[5]/div/div[7]/ul/li[2]/a")
    public WebElement faqsButton;

    public AlterNetPage(){
        PageFactory.initElements(drv,this);
    }
}
