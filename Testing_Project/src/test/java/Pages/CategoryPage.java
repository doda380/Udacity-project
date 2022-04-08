package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hook;

import java.util.List;
import java.util.Random;

public class CategoryPage {


    public void hover_sub(WebDriver driver) {

        WebElement menu_bar = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        List<WebElement> l1 = menu_bar.findElements(By.xpath("//ul [@class=\"top-menu notmobile\"]//li//ul//li[not(@class=\"sublist first-level\")]"));
        Actions act = new Actions(driver);
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            menu_bar = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
            l1 = menu_bar.findElements(By.xpath("//ul [@class=\"top-menu notmobile\"]//li//ul//li[not(@class=\"sublist first-level\")]"));
            act.moveToElement(menu_bar).moveToElement(l1.get(r.nextInt(3))).click().build().perform();
            driver.get("https://demo.nopcommerce.com/");
        }
    }

    public void select(WebDriver driver) {

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();

    }


}
