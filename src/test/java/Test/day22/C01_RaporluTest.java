package Test.day22;

import Pages.BrcPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

      /*
    -https://www.bluerentalcars.com/ adresine git
      -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
            -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


     */
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() {
        extentTest=extentReports.createTest("PozitifTest","Gecerli kullanıcı adı ve password ile giris yapıldı");
        //  -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue rent a car sitesine gidildi");
        extentTest.info("Login butonuna basıldı");
        extentTest.info("Doğru kullanıcı ve password girildi");
        extentTest.info("2.Login butonuna basıldı");

       // -login butonuna bas
        brcPage.login.click();
      //  -test data user email: customer@bluerentalcars.com ,
      //  -test data password : 12345 dataları girip login e basın
       brcPage.basicEmail.sendKeys(ConfigReader.getProperty("useremail"));
       actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass"))
               .sendKeys(Keys.ENTER).perform();

      //  -Degerleri girildiginde sayfaya basarili sekilde
        //  girilebildigini test et
   String expecedgiris="John Walker";
   String actualgiris=brcPage.basariligiris.getText();
   Assert.assertEquals(expecedgiris, actualgiris);
   extentTest.pass("Sayfaya basrılı bir şekilde girildi");

   //eğer hata raporu alırsak ve raporda resmi görüntülemek istersek rapor üzerine sağ click
//open, explorer secip resimli raporu görüntüleyebiliriz.
    }
}
