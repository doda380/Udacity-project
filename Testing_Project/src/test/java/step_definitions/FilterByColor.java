package step_definitions;

import Pages.FilterByColorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FilterByColor {

FilterByColorPage f = new FilterByColorPage();

    @And("user will navigates to the home page")
    public void navigate(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com");
    }

    @When("user select Apparel - shoes")
    public void select(){
    f.select_Apparel_shoes(Hook.driver);
    }

    @And("use filter by the color")
    public void filter(){
        f.filter_color(Hook.driver).click();
    }

    @Then("item with color chosen will appear")
    public void check(){
        f.check_items(Hook.driver);
    }





}
