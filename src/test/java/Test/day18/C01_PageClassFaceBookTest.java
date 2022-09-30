package Test.day18;

import Pages.FaceBookPage;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class C01_PageClassFaceBookTest {
    /*
     https://www.facebook.com/ adresine gidin
        POM’a uygun olarak email, sifre kutularini ve giris yap
        butonunu locate edin
        Faker class’ini kullanarak email ve sifre degerlerini
        yazdirip, giris butonuna basin
        Basarili giris yapilamadigini test edin
     */

      FaceBookPage faceBookPage = new FaceBookPage();
      Faker fk= new Faker();
    @Test
    public void test01() {
        //   https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        faceBookPage.emailkutusu.sendKeys(fk.internet().emailAddress());
        faceBookPage.sifrekutusu.sendKeys(fk.internet().password());
        faceBookPage.girisbutonu.click();

      //  Basarili giris yapilamadigini test edin
        Assert.assertTrue(faceBookPage.girisyapılamadı.isDisplayed());




    }
}
