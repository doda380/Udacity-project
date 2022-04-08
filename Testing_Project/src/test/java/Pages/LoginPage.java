package Pages;

import io.cucumber.messages.types.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebElement Email_Filed(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"Email\"]"));
    }

    public WebElement Password_Filed(WebDriver driver){
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).click();
        return driver.findElement(By.xpath("//*[@id=\"Password\"]"));
    }


    public void LoginSteps(WebDriver driver,String Email, String password )
    {
        Email_Filed(driver).sendKeys(Email);
        Password_Filed(driver).sendKeys(password);
    }






}
