package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPage {

public WebElement ForgetPassword(WebDriver driver){
    return driver.findElement(By.linkText("Forgot password?"));
}

    public WebElement Email_Filed(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"Email\"]"));
    }


    public WebElement Submit(WebDriver driver){
    return driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }


    public WebElement Confirmation(WebDriver driver){
    return driver.findElement(By.xpath("//p[@class=\"content\"]"));
    }


    public void RecoverSteps(WebDriver driver,String Email)
    {
        Email_Filed(driver).sendKeys(Email);
    }





}
