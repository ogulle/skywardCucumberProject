package Skyward.Step_Definitions;

import Skyward.Pages.SkywardSearchPage;
import Skyward.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class StudentList_StepDefinitions {
    SkywardSearchPage searchPage = new SkywardSearchPage();


    @Given("User is on main page")
    public void user_is_on_main_page() {
        Driver.getDriver().get("https://skyward.iscorp.com/ScienceTechTXStuSTS");
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchPage.userName.sendKeys("osman.gulle");
        searchPage.password.sendKeys("Parola61");
        searchPage.signInClick.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Skyward");

    }
    @When("User search Houston list")
    public void user_search_list() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchPage.schoolSearchButton.click();
        List<WebElement> schoolList = searchPage.pickSchool;
        for (WebElement each : schoolList) {
            if (each.getText().contains("Houston")) {
                each.click();
                break;
            }
        }
        Thread.sleep(3000);
        searchPage.mainMenuSearch.click();
        searchPage.studentListButton.click();
        searchPage.StudentListMoreButton.click();
        searchPage.addToDashboardButton.click();
        searchPage.addToDashboardDisplayName.click();
        Thread.sleep(3000);
        searchPage.dashBoardTileText.sendKeys(" - Houston");
        Thread.sleep(3000);
        searchPage.saveButton.click();
        Thread.sleep(3000);
        searchPage.homeButton.click();


    }
    @Then("User should see number of Houston students")
    public void user_should_see_number_of_students() {
        System.out.println("user can see the number of student");
    }
}
