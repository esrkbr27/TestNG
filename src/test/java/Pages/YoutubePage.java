package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {
    //YoutubePage constructorı PageFactory classından kullandıgı metot ile
    //driverı alıp Youtube sayfası (this) ile ilşki kurup bizi bu sayfaya götürüyor.

    public YoutubePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@id='logo-icon'])[1]")
    public WebElement logo;


}
