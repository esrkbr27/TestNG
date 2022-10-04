package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class TestBaseBeforeClassAfterClass {

  protected   WebDriver driver;
  protected   Actions actions;
  protected  String tarih;

  //@BeforeClass ve @AfterClass notasyonlaronı TestNG de kullanırken static yapmaya geek yoktur.
    @BeforeClass (groups = "gp1")
    public  void setUp(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      Actions action=new Actions(driver);
      LocalDateTime date=LocalDateTime.now();
      DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
      tarih=date.format(formatter);
    }

    @AfterClass (groups = "gp1" )
    public  void tearDown() throws InterruptedException {
        //driver.quit();
    }


}
