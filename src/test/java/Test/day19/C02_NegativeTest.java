package Test.day19;

import Pages.hmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_NegativeTest {
    @Test
    public void testnegative() {
        /*
                1 ) Bir Class olustur : NegativeTest
        2) Bir test method olustur NegativeLoginTest()
        https://www.hotelmycamp.com/ adresine git
        login butonuna bas
        test data username: manager1 ,  test data password : manager1!
                Degerleri girildiginde sayfaya girilemedigini test et
         */
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage hmcPage=new hmcPage();
        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongusername"));
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("hmcWrongpassword")).
                sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(hmcPage.girisYapılamadı.isDisplayed());
        Driver.closeDriver();


    }
}
