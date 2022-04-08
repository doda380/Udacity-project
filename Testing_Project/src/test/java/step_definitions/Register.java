package step_definitions;

import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Register {

RegisterPage reg;
    @And("user navigates to register page")
    public void Navigate(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
        Hook.driver.findElement(By.className("ico-register")).click();
    }
    @When("^user enter \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\" and \"(.*)\"$")
    public void Enter_Register_Credentials(String FirstName, String LastName,String password ,String conf_password ,String Email, String company) {

        reg = new RegisterPage();
        reg.RegSteps(Hook.driver,FirstName,LastName,Email,company,password,conf_password);
        Select se1 = new Select(Hook.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")));
        se1.selectByIndex(5);
        Select se2 = new Select(Hook.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")));
        se2.selectByIndex(7);
        Select se3 = new Select(Hook.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")));
        se3.selectByIndex(2);


    }

    @And("user pressed register button")
    public void press(){
        Hook.driver.findElement(By.id("register-button")).click();

    }

    @Then("user redirected to confirmation page")
    public void confirmation(){

        Assert.assertEquals(Hook.driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }



}
