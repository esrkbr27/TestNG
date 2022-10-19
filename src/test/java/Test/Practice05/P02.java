package Test.Practice05;

import utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
// 3. Açılır metni alın
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
// 5. Açılır pencereyi kabul edin


    @Test
    public void test1() {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.id("button1")).click();

        // 3. Açılır metni alın ekranda yazdırın
        System.out.println(driver.switchTo().alert().getText());


        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        String expectedmesaj="I am an alert box!";
        String actualmesaj=driver.switchTo().alert().getText();

        Assert.assertEquals(expectedmesaj, actualmesaj);

        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();

    }
}
