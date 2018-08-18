package TestTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubPage {

    @FindBy(css = "meta[name=\"description\"]")
    WebElement metaDescription;

    @FindBy(css = "h1[class=\"h000-mktg text-white lh-condensed-ultra mb-3\"]")
    WebElement h1Text;

    @FindBy(css = "h1[class=\"vcard-names\"] span:nth-child(2)")
    WebElement h1Text2;

    @FindBy(css = "div[id=\"auth\"] h1")
    WebElement h1Text3;


    public GitHubPage(WebDriver driver){PageFactory.initElements(driver,this);
    }
}
