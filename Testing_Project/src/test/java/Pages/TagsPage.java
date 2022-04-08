package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import step_definitions.Hook;

import java.util.List;
import java.util.Random;

public class TagsPage {

    public void select_Apparel_shoes(WebDriver driver){
        WebElement menu_bar = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));
        Actions act = new Actions(driver);

        act.moveToElement(menu_bar).moveToElement(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]"))).click().build().perform();
    }


    public void Select(WebDriver driver) {
        WebElement menu_bar = driver.findElement(By.xpath("//div [@class=\"tags\"]"));
        List<WebElement> l1 = menu_bar.findElements(By.xpath("//div [@class=\"tags\"]//ul//li//a"));
        Actions act = new Actions(driver);
        Random r = new Random();
        for (int i = 0; i < l1.size(); i++) {
            menu_bar = driver.findElement(By.xpath("//div [@class=\"tags\"]"));
            l1 = menu_bar.findElements(By.xpath("//div [@class=\"tags\"]//ul//li//a"));
            act.moveToElement(menu_bar).moveToElement(l1.get(r.nextInt(3))).click().build().perform();
            driver.get("https://demo.nopcommerce.com/shoes");
        }

    }
}
