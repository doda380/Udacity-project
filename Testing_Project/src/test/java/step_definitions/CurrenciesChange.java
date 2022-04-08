package step_definitions;

import Pages.CurrenciesChangePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CurrenciesChange {

    CurrenciesChangePage curen = new CurrenciesChangePage();
    int currentValue;
    @And("user navigates to Home page")
    public void Navigate(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user press the combo box")
    public void press(){

        curen.pressbox(Hook.driver).click();

    }



    @And("^user Select \"(.*)\"$")
    public void SelectValue(int value){
        curen.selectValue(Hook.driver,value);
        currentValue=value;

    }


    @Then("The currency change")
    public void Check(){
        Assert.assertTrue(Hook.driver.findElement(By.xpath("//select[@id='customerCurrency']")).isDisplayed());
    }


}
