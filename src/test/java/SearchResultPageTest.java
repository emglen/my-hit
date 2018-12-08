import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchResultPageTest {
    private WebDriver driver;

    private SearchResultPage searchResultPageObj;
    private MainPage mainPageObj;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://my-hit.org");
    }

    @Test
    public void searchWithotResult(){
        searchResultPageObj=new SearchResultPage(driver);
        mainPageObj=new MainPage(driver);

        mainPageObj.clickOnSearchButton();
        searchResultPageObj.typeSearchTextbox("gfvbnm;lgjghhggj");
        searchResultPageObj.clickSearchButton();
        Assert.assertTrue(searchResultPageObj.errorWithoutSearchResultIsVisible());
    }

    @After
    public void endAllTest(){
        driver.quit();
    }
}
