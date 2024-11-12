package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SignUpSteps {

    @Given("I am on the Magento signup page")
    public void i_am_on_the_magento_signup_page() {
    }

    @When("I enter the first name {string}, last name {string}, email {string}, password {string}, and confirm password {string}")
    public void i_enter_the_first_name_last_name_email_password_and_confirm_password(String firstName, String lastName, String email, String password, String confirmPassword) {
    }

    @When("I click the Create an Account button")
    public void i_click_the_create_an_account_button() {
    }

    @Then("I should be redirected to the account dashboard")
    public void i_should_be_redirected_to_the_account_dashboard() {
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String errorMessage) {
    }
}
