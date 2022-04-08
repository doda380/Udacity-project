package step_definitions;

import Pages.ResetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResetPassword {

ResetPage reset = new ResetPage();
    @When("user press forget password link text")
    public void Forget_password(){
       reset.ForgetPassword(Hook.driver);
    }


    @And("^user enter recovery \"(.*)\"$")
    public void Enter_Email_Recovery(String Email){
        reset.RecoverSteps(Hook.driver,Email);
        reset.Submit(Hook.driver).click();
    }


    @Then("confirmation message will appear")
    public void Email_Recovery_Confirmation(){
        Assert.assertTrue(reset.Confirmation(Hook.driver).isDisplayed());
    }
}
