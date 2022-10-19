package Test.day21;

import Pages.AmazonPage;
import Test.log4j.Log4JTest2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    private static Logger logger= LogManager.getLogger(Log4JTest2.class.getName());

    @Test
    public void test01() throws IOException {
        logger.info("hepsiburada sitesine gidilir");
        //"hepsiburada sayfasına gidiniz ve sayfanın resmını alınız.

        Driver.getDriver().get("https://hepsiburada.com");
          logger.info("ekranGoruntusu alıyoruz");
        //sayfanın resmını alınız.
        ReusableMethods.getScreenshot("hepsiburada");

        logger.warn("driver kapatılır");
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
