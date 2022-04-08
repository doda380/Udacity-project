package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import step_definitions.Hook;

import java.util.ArrayList;

public class SearchPage {


    public WebElement ClickOnSearch(WebDriver driver) {
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement Search_NameOf_Product(WebDriver driver) {
        return ClickOnSearch(driver);
    }


    public WebElement Press_Btn(WebDriver driver) {
        return driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }




    public void Search_Steps(WebDriver driver, String Product){




            int count =  driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();

            for(int i = 0; i<count;i++){

                Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(i).getText().toLowerCase().contains(Product));
            }

    }
}
