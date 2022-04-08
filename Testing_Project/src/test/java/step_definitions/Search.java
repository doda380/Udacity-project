package step_definitions;

import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.ArrayList;




public class Search {


    SearchPage search;
    String productName;
    @And("user navigates to home page")
    public void Navigate(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user clicks on search field")
    public void ClickOnSearch(){

        search= new SearchPage();
        search.ClickOnSearch(Hook.driver).click();

    }


    @And("^user search with name of product \"(.*)\"$")
    public void Search_NameOf_Product(String product){

    search.Search_NameOf_Product(Hook.driver).sendKeys(product);
    productName=product;
    search.Press_Btn(Hook.driver).click();
    }


    @Then("user could find relative product")
    public void FindProduct(){
        search.Search_Steps(Hook.driver,productName);
    }






}
