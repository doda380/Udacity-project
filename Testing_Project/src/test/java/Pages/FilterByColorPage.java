package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import step_definitions.Hook;

public class FilterByColorPage {

    public void select_Apparel_shoes(WebDriver driver){
        WebElement menu_bar = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));
        Actions act = new Actions(driver);

        act.moveToElement(menu_bar).moveToElement(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]"))).click().build().perform();
    }

    public WebElement filter_color(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='attribute-option-15']"));
    }


    public void check_items(WebDriver driver){
        int count =  driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();

        for(int i = 0; i<count;i++){

            Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(i).isDisplayed());
        }
    }

}
