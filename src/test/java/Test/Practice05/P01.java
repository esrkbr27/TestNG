package Test.Practice05;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class P01 extends TestBaseBeforeMethodAfterMethod {

    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the lastname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button


    @Test
    public void test01() {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
        firstname.sendKeys("Esra");

        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Demirci");

        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-1']")).click();

        //check the experience
        driver.findElement(By.xpath("//*[@id='exp-0']")).click();



        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("28.09.2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("*//[@id='profession-1']")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();

        //choose your continent -> Antartica
        WebElement ddcontinent=driver.findElement(By.xpath("//select[@id='continents']"));

        Select options=new Select(ddcontinent);
        options.selectByVisibleText("Antartica");

       //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]"));

        ////click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();

    }
}
