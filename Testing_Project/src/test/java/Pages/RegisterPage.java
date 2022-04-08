package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import step_definitions.Hook;

public class RegisterPage {


    public WebElement FirstName(WebDriver driver){
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement LastName(WebDriver driver){
        return driver.findElement(By.id("LastName"));
    }

    public WebElement Email(WebDriver driver){
        return driver.findElement(By.id("Email"));
    }

    public WebElement Company(WebDriver driver){
        return driver.findElement(By.id("Company"));
    }

    public WebElement Password(WebDriver driver){
        return driver.findElement(By.id("Password"));
    }

    public WebElement Conf_Password(WebDriver driver){
        return driver.findElement(By.id("ConfirmPassword"));
    }


    public void RegSteps(WebDriver driver,String FirstName, String LastName, String password , String conf_password , String Email , String Company)
    {
        FirstName(driver).sendKeys(FirstName);
        LastName(driver).sendKeys(LastName);
        Email(driver).sendKeys(Email);
        Company(driver).sendKeys(Company);
        Password(driver).sendKeys(password);
        Conf_Password(driver).sendKeys(conf_password);


    }
}
