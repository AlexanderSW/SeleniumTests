package TestTask;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class LoginPositiveTest extends BaseTestTask {

    GeneralPage page = new GeneralPage(driver);

    @Test
    public void positiveTest() throws IOException, InterruptedException {

        open("http://the-internet.herokuapp.com/");

        // Positive test login
        page.formAuthentication.click();
        page.usernameField.sendKeys("tomsmith");
        page.passwordField.sendKeys("SuperSecretPassword!");
        page.submitButton.click();
        assertThat(textToBePresentInElement(page.errorMassege,"You logged into a secure area!"));

        // Screenshot
        Thread.sleep(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/podobulki/IdeaProjects/SeleniumTests/Screenshot/testPositiveScreen.png"));
    }
}
