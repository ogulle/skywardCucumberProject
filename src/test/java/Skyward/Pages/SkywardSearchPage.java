package Skyward.Pages;

import Skyward.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SkywardSearchPage {

    public SkywardSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInClick;

    @FindBy(xpath = "//a[@class='headerSelect__label headerSelect__label--bold svgAnchor']")
    public WebElement schoolSearchButton; //click

    @FindBy(xpath = "//label[@class='headerSelect__option headerSelect__option--indented']")
    public List<WebElement> pickSchool;

    @FindBy(xpath = "//a[@aria-label='Toggle Main Menu']")
    public WebElement mainMenuSearch; //click

    @FindBy(linkText = "Student List")
    public WebElement studentListButton; //click

    @FindBy(xpath = "//a[@aria-label='More Row Options']")
    public WebElement StudentListMoreButton;

    @FindBy(linkText = "Add Live Tile to Dashboard")
    public WebElement addToDashboardButton;

    @FindBy(id = "AddLiveTileDisplayName")
    public WebElement dashBoardTileText;

    @FindBy(id = "Home_primary0")
    public List<WebElement> titleInfo; //print and check the values in text

    @FindBy(id = "AddLiveTileDisplayName")
    public WebElement addToDashboardDisplayName;

    @FindBy(id = "saveLiveTile")
    public WebElement saveButton;

    @FindBy(id = "home")
    public WebElement homeButton;



}
