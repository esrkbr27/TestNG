package Test.day16;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    //Testlerimizi çalıştıurıken istediğimiz sıraya göre
    //çalışmasını istersek "priority" kullanırız.

    //Priority kullanmazsak default olarak 0 dır.ve ilk bu test çalışır.


    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test (priority =3)
    public void BestBuytesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test (priority = -1)
    public void hepsiburadaTesti() {
        driver.get("https://www.hepsiburada.com");
    }

}
