package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hmcPage {

    public hmcPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@class='btn btn-circle btn-default']")
    public WebElement loginkontrol;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement girisYapılamadı;


}
