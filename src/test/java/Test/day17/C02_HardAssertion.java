package Test.day17;

import utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_HardAssertion extends TestBaseBeforeMethodAfterMethod {

    // Hard Assertions : JUNit'te öğrendiğimiz assertion ile aynıdır.
    // Assert.assertTrue();  Assert.assertFalse();  Assert.assertEquals();
// Hard Assertions'da herhangi bir assertion failed olursa,
// test method'un çalışmasını durdurur ve kalan kodları yürütmez.(stop execution)

// Soft Assert : Kullanabilmek için obje oluştururuz, oluşturduktan sonra obje ismi ile kullanırız,
// Herhangi bir hata verdiğinde test methodu
// çalışmaya devam eder, en sonra rapor verir.
// baslangıc  SoftAssert objeadı=new SoftAssert();  bitis objeadı.assertAll();

    @Test (groups = "gp1")
    public void test01() {
        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //3-arama kutusnun erişilebilir oldugunu tets edin
        Assert.assertTrue(driver.findElement(By.id("twotabsearchbox")).isEnabled());
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.xpath("twotabsearchbox")).sendKeys("NuTella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin
        Assert.assertTrue(sonuc.getText().contains("Nutella"));

    }
}
