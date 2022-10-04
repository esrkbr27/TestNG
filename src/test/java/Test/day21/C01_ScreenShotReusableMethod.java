package Test.day21;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {
        //"hepsiburada sayfasına gidiniz ve sayfanın resmını alınız.

        Driver.getDriver().get("https://hepsiburada.com");

        //sayfanın resmını alınız.
        ReusableMethods.getScreenshot("hepsiburada");

        //sayfayı kapatınız.
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        AmazonPage amazonpage = new AmazonPage();
        //amazon sayfasına gidiniz.Nutella aratınız.sonra arama sonuc yazısı web elementinin resmını alınız
        Driver.getDriver().get(ConfigReader.getProperty("amazonurl"));
        amazonpage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        ReusableMethods.getScreenshotWebElement("aramasonucu",amazonpage.aramaSonucWE);


    }
}
