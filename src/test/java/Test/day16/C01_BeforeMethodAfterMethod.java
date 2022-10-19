package Test.day16;

import utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");

    }

    @Test (groups = "gp1")
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducationTesti() {
    }
}
