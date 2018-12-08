import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
    private WebDriver driver;
    private MainPage mainPageObj;
    private SignInPopup signInPopupObj;
    private FilmCatalogPage filmCatalogPageObj;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://my-hit.org");
    }

    @Test
    public void loginPopupIsOpened(){
        mainPageObj=new MainPage(driver);
        signInPopupObj=new SignInPopup(driver);
        mainPageObj.clickOnSignInButton();
        Assert.assertEquals(signInPopupObj.getText("//div/h3[@id='myModalLabel']"),"Вход или регистрация");
    }

    @Test
    public void openMenuPopularFilm(){
        mainPageObj=new MainPage(driver);
        filmCatalogPageObj=new FilmCatalogPage(driver);
        mainPageObj.selectMenuList("Фильмы", "Популярные");
        Assert.assertEquals(filmCatalogPageObj.getActiveCategoryText(),"Популярные");
    }

    @After
    public void endAllTest(){
        driver.quit();
    }
}
