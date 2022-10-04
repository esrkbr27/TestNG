package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class webUniverstyPage {

    public webUniverstyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy(xpath = "//*[@type='text']")
    public WebElement textbox;

    @FindBy(xpath = "//li")
    public List<WebElement> todoswebelements;

    @FindBy (xpath = "//*[@class='fa fa-trash']")
    public List<WebElement> deletebuttons;



}
