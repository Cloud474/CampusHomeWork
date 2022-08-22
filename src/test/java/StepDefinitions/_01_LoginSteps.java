package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://campus.techno.study/");
        GWD.getDriver().manage().window().maximize();
    }
    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndClick("acceptCookies");
        dc.findAndSend("userName","bulut-59@hotmail.com");
        dc.findAndSend("password","abc123xyz");
        dc.findAndClick("login");
    }
    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
        dc.findAndContainsText("success","Merhaba, Hüseyin Bulut !");
    }
    @When("Input login username and password")
    public void ınputLoginUsernameAndPassword() {
        dc.findAndClick("acceptCookies");
        dc.findAndSend("userName","abc");
        dc.findAndSend("password","1234");
        dc.findAndClick("login");
    }
    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        dc.findAndContainsText("error","Invalid username or password");
    }


}
