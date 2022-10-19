package Test.Practice09;

import Pages.SearchProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class SearchProduct {

    // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Ürünler' butonuna tıklayın
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    SearchProductPage searchProductPage;
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void testsearchProductPage() {
         searchProductPage  = new SearchProductPage();
        Driver.getDriver().get("http://automationexercise.com");
        // 3. Ana sayfanın başarıyla görünür olduğunu dğrulayın
        String homeurl="https://automationexercise.com/";
        Assert.assertEquals(homeurl,Driver.getDriver().getCurrentUrl());
        // 4. 'Ürünler' butonuna tıklayın
        searchProductPage.product.click();
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProductPage.allProducts.isDisplayed());
        //Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue top");
        searchProductPage.submitSearchButton.click();
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        //7 tane ürünun görünür oldugunu görmek için tüm ürünleri liste atmam lazım
        //forun içinde tüm elemanların görünür oldugunu test ettik
        List<WebElement> ürünler=searchProductPage.productImages;
        for (WebElement product : ürünler) {
            Assert.assertTrue(product.isDisplayed());
        }
        Assert.assertTrue(searchProductPage.searchProductTitle.isDisplayed());
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        actions.click(searchProductPage.viewProduct).click();
        Assert.assertTrue(searchProductPage.bluetop.isDisplayed());
    }
}
