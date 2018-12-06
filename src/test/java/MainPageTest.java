import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    WebDriver driver;
    MainPage mainPageObj(driver);
    SignInPopup signInPopup(driver);

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://my-hit.org");
    }

    @Test
    public void loginPopupIsOpened(){
        mainPageObj.clickOnSignInButton();
        Assert.assertEquals(signInPopup.getText("//div/h3[@id='myModalLabel']"),"Вход или регистрация");
    }

    @After
    public void endAllTest(){
        driver.quit();
    }
}
