package Test.Practice06;

import Pages.DhtmlgoodiesPage;
import utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P01 {
    // Go to URL :
// Fill in capitals by country.


    @Test
    public void test1() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());

        //draganddrop() metodu neyı(source) nereye bırakacagımı(target) soruyor.
        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norwey).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).
                dragAndDrop(dhtmlgoodiesPage.copenhag, dhtmlgoodiesPage.danmark).
                dragAndDrop(dhtmlgoodiesPage.seul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();

        //dirverı kapatalım
        Driver.closeDriver();

        /*
        FrameWorkler büyüdükçe yenı classlar, yenı test metodları
        yenı webelementler oluşturdukça içinden çıkılmaz,

        anlaşılmaz, tekrar bakımı yapılmaz(maintanence),güncellemesi çok zor hatta imkansız olur
        Uzmanlar bu nedenle reusable, rahat maintable edilebilir bir framework için bir design pattern olarak
        POM (PAGE OBJECT MODEL) de karar vermişler.Olmazsa olmazlar;
        1.Driver class
        2.Page class
        3.Test class
        Utilities classı da önemlidir.

     -Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
     ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.

         */





    }
}
