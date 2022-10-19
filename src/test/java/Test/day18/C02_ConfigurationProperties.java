package Test.day18;

import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //Amazon ve facebook sayfalarına gidelim
        String urlamzn = ConfigReader.getProperty("amznUrl");
        String urlFace = ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();





    }
}
