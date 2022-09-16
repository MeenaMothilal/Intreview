package step_file;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project_base.Base_Class;
import properties.File_Reader_Manager;

import java.io.IOException;

public class Step_Definition extends Base_Class {
    @Given("user successfully navigate to the {string}")
    public void user_successfully_navigate_to_the(String string) throws IOException {
       String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
       urlLaunch(url);
    }

    @When("user click on the draw a line")
    public void user_click_on_the_draw_a_line() {
clickElement();
    }

    @When("user can draw one horizontal line and vertical line should be intercept")
    public void user_can_draw_one_horizontal_line_and_vertical_line_should_be_intercept() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user can click on draw a rectangle line")
    public void user_can_click_on_draw_a_rectangle_line() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user can draw a rectangle")
    public void user_can_draw_a_rectangle() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user can click use eraser and erase the horizontal line")
    public void user_can_click_use_eraser_and_erase_the_horizontal_line() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
