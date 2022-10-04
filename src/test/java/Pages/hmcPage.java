package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hmcPage {

    public hmcPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//*[@class='btn btn-circle btn-default']")
    public WebElement loginkontrol;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement girisYapılamadı;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelmanagament;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservation;

    @FindBy (xpath = "//*[text()='Add Room Reservation '] ")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy (xpath = "(//*[@class='modal-body'])[1]")
    public WebElement basariligirisyapildi;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement okbutton;

}
