package Test.Practice07;

import Pages.webUniverstyPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.LayoutQueue;
import java.util.ArrayList;
import java.util.List;

public class P01 {
    // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
//Tüm yapılacakların üzerini çiz.
//Tüm yapılacakları sil.
//Tüm yapılacakların silindiğini doğrulayın.

    //Exploratory testing;Keşif Testi (Exploratory Testing) ,test senaryolarının önceden oluşturulmadığı,
    // testçilerin sistemi test anında kontrol ettiği bir tür yazılım testidir.
    // Herhangi bir test senaryosuna bağlı kalmaksızın yazılımları serbestçe keşfederek buldukları bug’ları raporlamasına dayanır.
    // Test uzmanlarının minimum planlama ve maksimum test uygulamasına katıldığı uygulamalı bir yaklaşımdır.

    @Test
    public void test01() throws InterruptedException {
        webUniverstyPage webUniverstyPage = new webUniverstyPage();
        Actions actions = new Actions(Driver.getDriver());

        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle:
     List<String> liste= new ArrayList<String>(List.of("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen",
             "Çocuğunun ödevine yardım et", "Selenyum çalış", "Uyu"));

        for (String w:liste) {
            actions.click(webUniverstyPage.textbox).sendKeys(w, Keys.ENTER).perform();
        }

        //Tüm yapılacakların üzerini çiz.

        //TODO yazdıgım yerın hepsının locateını (//li tagı ile) Pages classında liste attım
        //üzerini çizmek için sitede web elemetlerinın uzerine click yapmam gerekiyor.
        Thread.sleep(2000);
        List<WebElement> todos=webUniverstyPage.todoswebelements;
        for (WebElement w : todos) {
            w.click();
        }

        //Tüm yapılacakları sil.
        List<WebElement> deletebuttons=webUniverstyPage.deletebuttons;
        for (WebElement w : deletebuttons) {
            w.click();
        }

        //Tüm yapılacakların silindiğini doğrulayın.

        // "//li" tagı silme işlemini yaptıkça siliniyor,li tagını koydugum listin size ==0 olursa burda li tagı yok demektir

        Thread.sleep(2000);


        Assert.assertTrue(webUniverstyPage.todoswebelements.isEmpty());
        Assert.assertEquals(0,webUniverstyPage.todoswebelements.size());


        }


        }




