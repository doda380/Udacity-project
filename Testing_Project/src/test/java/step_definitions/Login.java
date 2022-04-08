package step_definitions;



import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Login {

    LoginPage login;

    @And("user navigates to Login page")
    public void ValidLogin(){
        Hook.driver.navigate().to("https://demo.nopcommerce.com/");
        Hook.driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
    }


    @When("^user enter valid \"(.*)\" , \"(.*)\"$")
    public void Enter_Login_Credentials(String Email, String Password){
        login= new LoginPage();
        login.LoginSteps(Hook.driver,Email,Password);

    }

    @And("press to login button")
    public void Press_Login_Btn(){
        Hook.driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

    }

    @Then("user will redirect to home page")
    public void Redirect_Confirmation(){
        Assert.assertEquals(Hook.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        Assert.assertTrue(Hook.driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).isDisplayed());
    }







}
