package Test.day21;

import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class C02_WindowHandlesReusableMethods {

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows ");
        //● Click Here butonuna basın.
        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();

        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");

        String expectedtitle="New Window";
        String actualtitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedtitle, actualtitle);
        Driver.closeDriver();

    }

    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows ");
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();

        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        List<String> pencereler= new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(pencereler.get(1));

        String expectedtitle="New Window";
        String actualtitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedtitle, actualtitle);



    }
}
