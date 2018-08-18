package TestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

    @FindBy(css = "a[href=\"/login\"]")
    WebElement formAuthentication;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(className = "radius")
    WebElement submitButton;

    @FindBy(id = "flash")
    WebElement errorMassege;

    public LoginPage(WebDriver driver){PageFactory.initElements(driver,this);
    }
}
