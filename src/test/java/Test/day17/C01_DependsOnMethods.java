package Test.day17;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C01_DependsOnMethods extends TestBaseBeforeMethodAfterMethod {

    //"dependsOnMethods ile testleri birbirine baglamış oluruz
    //hangisine baglı ise eger o test çalışmazsa (baglı oldugu test normalde callıştıgı halde)
    //bu testte calışmaz
    @Test
    public void test01() {
        driver.get("https://www.wamazon1.com");
    }

    @Test (dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://www.facebook.com");
    }


    @Test (dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://www.bestbye.com");
    }

    @Test (priority = -1)
    public void test04() {
        driver.get("https://www.youtube.com");
    }

    //Eger bir teste priority yazılmamışsa default olarak 0 olarak kabul edilir
    //priority=-1 olan bu nedenle ilk çalışır
}
