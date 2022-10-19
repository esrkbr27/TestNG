package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class deneme {
Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test1() {
        Driver.getDriver().get("https://pearlymarket.com/");

        actions.sendKeys(Keys.END).perform();
     Driver.getDriver().findElement(By.xpath("(//*[text()='My Account'])[2]")).click();


    }
}
