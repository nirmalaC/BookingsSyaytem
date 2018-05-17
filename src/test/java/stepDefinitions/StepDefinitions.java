package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BookingHomePage;

public class StepDefinitions {

    BookingHomePage page = PageFactory.initElements(BookingHomePage.driver, BookingHomePage.class);

    @Given("^I enter vaild details : (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void iEnterVaildDetailsFirstnameSurenamePriceDeposit(String firstname, String surename, String bookingprice, String deposit, String checinDate, String checkoutDate ) throws Throwable {
        page.enterDetails(firstname,surename, bookingprice, deposit, checinDate, checkoutDate);
    }

    @When("^I click on the save button$")
    public void iClickOnTheSaveButton() throws Throwable {
        page.save_button.click();
    }

    @Then("^I should be able to save the booking : (.*), (.*)$")
    public void iShouldBeAbleToMake(String firstname, String surename) throws Throwable {
        page.checkDetailsDisplayed(firstname);
        page.checkDetailsDisplayed(surename);
    }

    @Given("^vaild booking exists (.*), (.*)$")
    public void vaildBookingExistsFirstnameSurename(String firstname, String surename) {
        page.checkDetailsDisplayed(firstname);
        page.checkDetailsDisplayed(surename);
    }

    @When("^I click on the delete button$")
    public void iClickOnTheDeleteButton(){
        page.delete_button.click();
    }

    @Then("^the saved bookings should be deleted : (.*), (.*)$")
    public void theSavedBookingsShouldBeDeletedFirstnameSurename(String firstname, String surename) {
        page.checkDetailsAreDeleted(firstname);
        page.checkDetailsAreDeleted(surename);
    }
}