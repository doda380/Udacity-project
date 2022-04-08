package step_definitions;

import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ShoppingCart {

    ShoppingCartPage s = new ShoppingCartPage();

    @And("user navigate home page")
    public void navigate() {
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user press add to cart for a specific product")
    public void addcart() throws InterruptedException {
     s.AddToCart(Hook.driver).click();
     Thread.sleep(3500);
    }


    @When("user press add to Wish list for a specific product")
    public void Whislist(){
        s.AddToWishList(Hook.driver).click();
    }


    @When("user press add to compare list for a specific product")
    public void CompareList(){
        s.AddToCompareList(Hook.driver).click();
    }


    @Then("Confirmation message appear")
    public void Confirm(){
        s.ConfirmMessage(Hook.driver);

    }


    @Then("^user checkout by adding his info \"(.*)\" , \"(.*)\" , \"(.*)\" , \"(.*)\"$")
    public void checkout(String city,String address, String zipcode, String mobile) throws InterruptedException {
        s.CartCheckout(Hook.driver);
        s.Checkoutproceed(Hook.driver,city,address,zipcode,mobile);
    }







}
