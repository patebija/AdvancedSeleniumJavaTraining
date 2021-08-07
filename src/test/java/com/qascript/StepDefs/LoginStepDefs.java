package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.LoginPage;
import com.qascript.Utils.PropertiesUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class LoginStepDefs extends BaseClass {

    Properties properties = PropertiesUtil.loadUserProperties();


    @Given("user enters valid username in the email field")
    public void userEntersValidUsernameInTheEmailField() {
        String username = properties.getProperty("username");
        LoginPage.enterUsername(username);
    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);
    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("user enters invalid username in the email field")
    public void userEntersInvalidUsernameInTheEmailField() {
    }

    @And("user enters invalid password in the password field")
    public void userEntersInvalidPasswordInThePasswordField() {
    }

    @Then("error message is displayed")
    public void errorMessageIsDisplayed() {
    }
}
