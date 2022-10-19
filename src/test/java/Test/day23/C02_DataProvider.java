package Test.day23;

import Pages.BrcPage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {

    //https://www.bluerentalcars.com/ adresine git
    //login butonuna bas
    //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
    //login butonuna tiklayin
    //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        BrcPage brcPage = new BrcPage();
        Actions actions = new Actions(Driver.getDriver());
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"esra@gmail.com","12345"},{"kubra@gmail.com","6789"},{"esrakubra@gmail.com","*234"}};
    }

    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
         brcPage.login.click();

        brcPage.basicEmail.sendKeys(userEmail);
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
         Assert.assertTrue(brcPage.ikincigiris.isDisplayed());

    }
}
