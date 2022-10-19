package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProductPage {
 public   SearchProductPage(){
     PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[text()=' Products']")
    public WebElement product;

 @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProducts;

 @FindBy (xpath = "//*[@id='search_product']")
    public WebElement searchBox;

 @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement submitSearchButton;

 @FindBy(xpath = "(//h2)[3]")
    public WebElement searchProductTitle;

 @FindBy(linkText = "View Product")
    public WebElement viewProduct;

 @FindBy(xpath = "(//h2)[3]")
    public WebElement bluetop;

 @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> productImages;
}
