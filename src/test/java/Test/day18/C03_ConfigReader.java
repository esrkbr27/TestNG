package Test.day18;

import Pages.hmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class C03_ConfigReader {
    /*
       Bir Class olustur : PositiveTest
        2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git
         login butonuna bas
        test data username: manager ,  test data password : Manager1!
                Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */


    @Test
    public void test01() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        /*
        Page classındakı locatelerimize ulaşabilmek için Page
        classımızdan bir obje oluşturarak oluşturmuş olduğumuz obje ile
        page classımızdakı locatelerimize ulaşabilriz.

       Test Dataları configuration.properties fileında,
       locatelerım ise Page packagenın altında yer alır.
       Classımda datalara ulaşmak için ConfigReader.getProperty("..") metodunu kullanarak dataları alıyorum
       Page packageındakı classımdan obje üreterek de locatelere ulaşıyorum
         */
        hmcPage hmcPage=new hmcPage();
        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

      //  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.loginkontrol.isDisplayed());

        //Sayfanın fotoğrafını alaım

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File tumSayfaResmi= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi, new File("target/ekranGoruntusu/AllPage.jpeg"));
        Driver.closeDriver();



    }
}
