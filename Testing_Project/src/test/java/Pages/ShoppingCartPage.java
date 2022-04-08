package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import step_definitions.Hook;

public class ShoppingCartPage {

    public WebElement AddToCart(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]//div[@class=\"item-box\"][3]//button"));
    }

    public WebElement AddToWishList(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]//div[@class=\"item-box\"][3]//button[3]"));
    }

    public WebElement AddToCompareList(WebDriver driver){
        return driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]//div[@class=\"item-box\"][3]//button[2]"));
    }

    public WebElement City(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]"));
    }


    public WebElement ZipCode(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]"));
    }


    public WebElement Mobile(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]"));
    }

    public WebElement address(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]"));
    }


    public WebElement Shopingcartlink(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a"));
    }


    public void CartCheckout(WebDriver driver){
        Shopingcartlink(driver).click();
        checkbox(driver).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();

    }

    public void Checkoutproceed(WebDriver driver, String city ,String address, String zipcode, String mobile) throws InterruptedException {
        Select se1 = new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
        se1.selectByIndex(1);
        Thread.sleep(2500);
        Select se2 = new Select(driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_StateProvinceId\"]")));
        se2.selectByIndex(9);
        City(driver).sendKeys(city);
        address(driver).sendKeys(address);
        ZipCode(driver).sendKeys(zipcode);
        Mobile(driver).sendKeys(mobile);
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
        Thread.sleep(2500);
        Confirm_Order_Message(driver);
        Thread.sleep(2500);
        driver.findElement(By.xpath("//button[@class=\"button-1 order-completed-continue-button\"]")).click();

    }

    public WebElement checkbox(WebDriver driver){

        return driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));

    }

    public void ConfirmMessage(WebDriver driver){
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class=\"content\"]")).getText().contains("The product has been added to your "));
    }


    public  void Confirm_Order_Message(WebDriver driver){
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"title\"]//strong")).getText().contains("Your order has been successfully processed!"));
    }



}
