import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    private By searchTextbox= By.xpath("//input[@id='search-page-q']");
    private By searchButton= By.xpath("//div/span/button[@class='btn btn-success']");
    private By resultList= By.xpath("//div[@class='film-list']");
    private By errorWithoutSearchResult= By.xpath("//div[@class='col-xs-12']");

    public void typeSearchTextbox(String text){
        driver.findElement(searchTextbox).sendKeys(text);
    }
    public String getSearchTextboxText(){
        return driver.findElement(searchTextbox).getText();

    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public String getErrorWithoutSearchResultText(){
        return driver.findElement(errorWithoutSearchResult).getText();
    }
}
