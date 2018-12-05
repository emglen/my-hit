import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPopup {
    private WebDriver driver;
    public SignInPopup(WebDriver driver){
        this.driver=driver;
    }


    public String getText(String text){
        By loc=By.xpath(text);
        String text1 =driver.findElement(loc).getText();
        return text1;
    }
}
