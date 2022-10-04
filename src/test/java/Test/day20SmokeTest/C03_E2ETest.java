package Test.day20SmokeTest;

import Pages.hmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_E2ETest {
    /*
      https://www.hotelmycamp.com adresine git.
    Username textbox ve password metin kutularını locate edin ve asagidaki verileri
    Username : manager
    Password  : Manager1!
    Login butonuna tıklayın.
    Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
    Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
    Save butonuna tıklayın.
“RoomReservation was inserted successfully” textinin göründüğünü test edin.
    OK butonuna tıklayın.
     */

    @Test
    public void E2ETest() throws InterruptedException {
     Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
     hmcPage hmcPage=new hmcPage();
     Faker faker=new Faker();
     hmcPage.login.click();
     hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
     Actions action = new Actions(Driver.getDriver());
     action.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
             sendKeys(Keys.ENTER).perform();

     hmcPage.hotelmanagament.click();
     Thread.sleep(2000);
     hmcPage.roomReservation.click();
     Thread.sleep(2000);
     hmcPage.addRoomReservation.click();

     hmcPage.idUser.sendKeys("manager");
        action.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        Thread.sleep(3000);
        Assert.assertTrue(hmcPage.basariligirisyapildi.isDisplayed());
        hmcPage.okbutton.click();





    }
}
