package Test.day16;

import Utilities.TestBaseBeforeClassAfterClass;
import org.testng.annotations.Test;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void testamazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechproed() {
        driver.get("https://www.techproeducation.com");
    }
}
