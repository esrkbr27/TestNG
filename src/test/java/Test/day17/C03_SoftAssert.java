package Test.day17;

import utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();
        //softAssert.assertAll() metodunu koydugum yere kadar bastan itibaren  testim fail olsa bile
        //çalışmaya devam eder,Doğrulama içerisindeki message: "..." girersem
        //testim fail oldugunda bu mesajı konsaolda yazdırır.

        //1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Girdiğiniz kelimeyi içermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchbox")).isEnabled(),"WE erişilemez");
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.xpath("twotabsearchbox")).sendKeys("NuTella",Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonuc.isDisplayed(),"SonuçWE görüntülemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(sonuc.getText().contains("Nutella"));
        softAssert.assertAll();
        System.out.println("Hata varsa bu kısım çalışmaz");
    }



}
