package step_definitions;

import Pages.TagsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

public class Tags {

    TagsPage t = new TagsPage();

    @And("user will navigate home page")
    public void navigate() {
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }



    @When("user select Apparel _ shoes")
    public void select() {
        t.select_Apparel_shoes(Hook.driver);
    }



    @And("use select from Popular tags")
    public void Select_tag() {
        t.Select(Hook.driver);
    }

}





