package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    /*
    Asagıdakı constructorı neden oluşturduk?

    Çünkü;test packageında bu classtan obje oluşturmak için AmazonPage() constrct.
    kullanmak zorundayım.
    Bu nedenle bu classta biz de parametresız bir AmazonPage() constrct oluşturduk
    PageFactory classından oluşturdugumuz metot ile de Utilities packagendakı
    Driver claasında "driver" ımı "this" ile burayla ilişkilendirmiş oldum.
    Yanı driver ı elementleri locate edebilmek için buraya çagırmış oldum
     */
    public AmazonPage(){ //constructor oluşturup public yaparız.
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;
}
