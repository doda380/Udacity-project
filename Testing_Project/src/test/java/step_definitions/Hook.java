package step_definitions;

import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hook {


    static WebDriver driver =null;
    static Login lg = new Login();
    @Before
    public static void OpenBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public static void CloseDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
