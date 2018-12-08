import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilmCatalogPage {
    private WebDriver driver;
    public FilmCatalogPage(WebDriver driver){
        this.driver=driver;
    }

    private By activeCategory=By.xpath("//div/a[@class='btn btn-default btn-sm active']");

    public String getActiveCategoryText(){
        return driver.findElement(activeCategory).getText();
    }
}
