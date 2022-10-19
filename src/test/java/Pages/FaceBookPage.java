package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {

    public FaceBookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailkutusu;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement sifrekutusu;

    @FindBy (xpath = "//*[@name='login']")
    public WebElement girisbutonu;

    @FindBy (xpath = "//*[@class='_9ay7']")
    public WebElement girisyapılamadı;

}
