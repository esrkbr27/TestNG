package Test.day20SmokeTest;

import Pages.hmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_SmokeNegatifTest {

    @Test
    public void yanlısKullanıcı() {
        //TestCase1; yanlış kullanıcı adı
        //            doğru şifre
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage hmcPage=new hmcPage();
        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongusername"));
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(hmcPage.girisYapılamadı.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlısŞifre() {
        //TestCase2; doğru kullanıcı adı
        //            yanlış şifre

        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage hmcPage=new hmcPage();
        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("hmcWrongpassword")).
                sendKeys(Keys.ENTER).perform();

        Assert.assertTrue(hmcPage.girisYapılamadı.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlışKullanıcıveŞifre() {
        //TestCase3;  yanlış kullanıcı adı
        //            yanlış şifre

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
