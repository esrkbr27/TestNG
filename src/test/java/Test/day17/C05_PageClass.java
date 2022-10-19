package Test.day17;

import Pages.AmazonPage;
import utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C05_PageClass {

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }
}
