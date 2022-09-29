package Test.Ödev;

import Pages.YoutubePage;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Utilities.Driver.getDriver;

public class C01_SoftAssert {
    /*
1) Bir class oluşturun: YoutubeAssertions
2) https://www.youtube.com adresine gidin
3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    ○ titleTest => Sayfa başlığının "YouTube" oldugunu test edin
    ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    ○ wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin
 */

    SoftAssert softAssert = new SoftAssert();
    YoutubePage youtube=new YoutubePage();

    @Test
    public void test1() {
      Driver.getDriver().get("https://www.youtube.com ");

      //  ○ titleTest => Sayfa başlığının "YouTube" oldugunu test edin

      String expectedt="YouTube";
      String actualt=  Driver.getDriver().getTitle();
      softAssert.assertEquals(expectedt, actualt,"Title hatalı");

     //   ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        WebElement logo=youtube.logo;
        softAssert.assertTrue(logo.isDisplayed(),"Logo görünmedi");



    }
}
