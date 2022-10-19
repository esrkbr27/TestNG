package Test.Practice08;

import Pages.HerokuTestPage;
import utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class P01 {

    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
//Click all the buttons and verify they are all clicked

//Objeyı class seviyesinde oluşturursak olusuturdugum her test
//metodunda ayrı ayrı obje oluşturmama gerek yok
HerokuTestPage herokuTestPage;
Actions actions =new Actions(Driver.getDriver());



    @Test
    public void test01() {
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
        herokuTestPage=new HerokuTestPage();
        herokuTestPage.onblur.click();
        //onclick butonunun çalışması için önce boş bir yere tıklayıp
        // sonra üzerine tıklayınca aclıyor.
        herokuTestPage.onclick.click();
        herokuTestPage.onclick.click();
        //oncontex menuyu açmak için sag click yapmam lazım
        actions.contextClick(herokuTestPage.oncontextmenu).
                doubleClick(herokuTestPage.ondoubleclick).
                click(herokuTestPage.onfocus).
                //keyup, keydowwwn menuleri önce üzerine bir tık ,
                //sonra klavyeden bir yere tıklayınca aktifleşiyor.
                click(herokuTestPage.onkeydown).sendKeys(Keys.ENTER).
                click(herokuTestPage.onkeyup).sendKeys(Keys.ENTER).
                click(herokuTestPage.onkeypress).sendKeys(Keys.ENTER).
                //onmouseover butonu fareyi üzerine getirince aktifleşiyor.
                moveToElement(herokuTestPage.onmouseover).
                //onmouseleave fareyi üzerinden çekince aktifleşiyor
                //faremı onmouseover butonuna tekrar geldım aktifleşti
                moveToElement(herokuTestPage.onmouseleave).
                moveToElement(herokuTestPage.onmouseover).
                click(herokuTestPage.onmousedown).perform();

        //Tum butonların clıcklendiğini doğrulamak için clicklendikten sonra
        //cıkan yazıyı liste attık,Eger 11 tane bu yazıdan varsa tum butonlar acılmış demektir.

    }

    @Test (dependsOnMethods = "test01")
    //test02 dekı doğrulamam test01 e baglı oldugu için dependson ile oraya bağlamış olduk
    public void test02() {
        List<WebElement> clicked=herokuTestPage.eventtriggered;
        Assert.assertEquals(clicked.size(),11);
    }



}
