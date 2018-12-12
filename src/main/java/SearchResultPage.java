import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }

    private By searchTextbox= By.xpath("//input[@id='search-page-q']");
    private By searchButton= By.xpath("//div/span/button[@class='btn btn-success']");
    private By resultList= By.xpath("//div[@class='film-list']");
    private By errorWithoutSearchResult= By.xpath("//div[@class='col-xs-12']");

    private By filmWithEnterTextList=By.xpath("//div[@class='autocomplete-suggestion']/a");

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

    public List<WebElement> getResultList(){
        return driver.findElements(resultList);
    }

    public boolean errorWithoutSearchResultIsVisible(){
        return driver.findElement(errorWithoutSearchResult).isDisplayed();
    }

    public List<WebElement> getFilmWithEnterTextList(){
        return driver.findElements(filmWithEnterTextList);
    }

    public boolean filmWithEnterTextListIsVisible(){
          for(WebElement element: getFilmWithEnterTextList()){
              element.isDisplayed();
          }
          return true;
    }

}
