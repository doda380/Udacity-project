package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import step_definitions.Hook;

public class CurrenciesChangePage {

    public WebElement pressbox(WebDriver driver){
        return driver.findElement(By.xpath("//select[@id='customerCurrency']"));
    }

    public void selectValue(WebDriver driver, int value){

        Select se1 = new Select(driver.findElement(By.xpath("//select[@id='customerCurrency']")));
        se1.selectByIndex(value);

    }







}
