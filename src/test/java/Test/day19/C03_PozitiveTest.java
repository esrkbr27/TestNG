package Test.day19;

import Pages.hmcPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class C03_PozitiveTest {

    @Test
    public void testpozitif() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        hmcPage hmcPage=new hmcPage();
        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

        //  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.loginkontrol.isDisplayed());

        //Fotoğrafını alaım

        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File tumSayfaResmi= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(tumSayfaResmi, new File("target/ekranGoruntusu/AllPage.jpeg"));
        Driver.closeDriver();
    }
}
