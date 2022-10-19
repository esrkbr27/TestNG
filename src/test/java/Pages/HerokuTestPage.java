package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HerokuTestPage {

    public  HerokuTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='onblur']")
    public WebElement onblur;

    @FindBy (xpath = "//*[@id='onclick']")
    public WebElement onclick;

    @FindBy (xpath = "//button[@id='oncontextmenu']")
    public WebElement oncontextmenu;

    @FindBy (xpath = "//*[@id='ondoubleclick']")
    public WebElement ondoubleclick;

    @FindBy (xpath = "//button[@id='onfocus']")
    public WebElement onfocus;

    @FindBy (xpath = "//button[@id='onkeydown']")
    public WebElement onkeydown;

    @FindBy(xpath = "//*[@id='onkeyup']")
    public WebElement onkeyup;

    @FindBy(xpath = "//*[@id='onkeypress']")
    public WebElement onkeypress;

    @FindBy(xpath = "//*[@id='onmouseover']")
    public WebElement onmouseover;

   @FindBy(xpath = "//*[@id='onmouseleave']")
    public WebElement onmouseleave;

   @FindBy(xpath = "//*[@id='onmousedown']")
    public WebElement onmousedown;

   //Her click altında "Eventtriggered" yazısı çıkıyor
   //11 tane click oldugu için bunların hepsını bir liste attık
    @FindBy(xpath="//*[text()='Event Triggered']")
    public List<WebElement> eventtriggered;





}
