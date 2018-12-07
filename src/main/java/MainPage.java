import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver=driver;
    }
    private By signInButton= By.xpath("//div/ul/li/button");
    private By searchButton=By.xpath("//div/a[@role='button']");
    private By searchInput=By.xpath("//input[@id="search-navbar-q"]");

    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void typeTextIntoSearchTextbox(String text){
        driver.findElement(searchInput).sendKeys(text);
    }
}
