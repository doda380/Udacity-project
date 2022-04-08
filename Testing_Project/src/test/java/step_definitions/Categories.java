package step_definitions;

import Pages.CategoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;
import java.util.Random;


public class Categories {

CategoryPage categ = new CategoryPage();
    @And("user navigate to home page")
    public void navigate(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("user hover to a category and select from sub-category")
    public void hover() throws InterruptedException {
        categ.hover_sub(Hook.driver);

    }



    @And("^user Select the category itself")
    public void select() throws InterruptedException {

        categ.select(Hook.driver);

    }
}
