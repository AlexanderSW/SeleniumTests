package TestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralPage{

    @FindBy(css = "a[href=\"/login\"]")
    WebElement formAuthentication;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(className = "radius")
    WebElement submitButton;

    public GeneralPage(WebDriver driver){PageFactory.initElements(driver,this);
    }
}
