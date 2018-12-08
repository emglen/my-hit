import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver=driver;
    }
    private By signInButton= By.xpath("//div/ul/li/button");
    private By searchButton=By.xpath("//div/a[@role='button']");
    private By searchInput=By.xpath("//input[@id='search-navbar-q']");

    // Menu
    private By menuList=By.xpath("//div/ul[@class='nav navbar-nav']");
    private By menuDropdownList=By.xpath("//div/ul/li[@class='dropdown open']/ul[@class='dropdown-menu navbar-list-multi']");


    public void clickOnSignInButton(){
        driver.findElement(signInButton).click();
    }
    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void typeTextIntoSearchTextbox(String text){
        driver.findElement(searchInput).sendKeys(text);
    }
    public void selectMenuList(String textMenu, String textDropdownMenu){
        List<WebElement> menu=driver.findElements(menuList);
        for(WebElement element: menu){
            if(element.getText().contains(textMenu)){
                element.click();
                break;
            }
        }
        List<WebElement> menuDropdown=driver.findElements(menuDropdownList);
        for(WebElement element: menuDropdown){
            if(element.getText().contains(textDropdownMenu)){
                element.click();
                break;
            }
        }
    }
}
