package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

  public  BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

  @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement basicEmail;

  @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement basicPassword;

  @FindBy(xpath = "//*[@id='dropdown-basic-button']")
          public WebElement basariligiris;

  @FindBy(xpath = "//*[@class='dropdown-basic-button']")
          public WebElement ikincigiris;
}

