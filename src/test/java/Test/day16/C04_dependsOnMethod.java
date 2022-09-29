package Test.day16;

import Utilities.TestBaseBeforeClassAfterClass;
import Utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_dependsOnMethod extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1() {
        //amazon anasayfasına gidin
        driver.get("https://www.amazon.com");
    }

    @Test (dependsOnMethods = "test1")
    public void test2() {
        //nutella aratalım
        driver.findElement(By.id("twotabsearchbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        //sonuc yazsının "amazon" içerdiğini test edelim
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}
