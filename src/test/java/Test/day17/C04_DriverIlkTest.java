package Test.day17;

import utilities.Driver;
import org.testng.annotations.Test;

public class C04_DriverIlkTest {

    @Test
    public void test01() {

        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://bestbuy.com");
        Driver.getDriver().get("https://hepsiburada.com");
    }
}
