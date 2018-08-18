package TestTask;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class LoginNegativeTest extends BaseTest {

    LoginPage page = new LoginPage(driver);

    @Test
    public void negativeTest() throws IOException, InterruptedException {

        open("http://the-internet.herokuapp.com/");

        // Negative test if all fields are empty
        page.formAuthentication.click();
        page.submitButton.click();
        assertThat(textToBePresentInElement(page.errorMassege,"Your username is invalid!"));

        // Negative test if the password field is empty
        page.usernameField.sendKeys("tomsmith");
        page.submitButton.click();
        assertThat(textToBePresentInElement(page.errorMassege,"Your password is invalid!"));

        // Negative test if the username is incorrect
        page.usernameField.sendKeys("testUserName");
        page.passwordField.sendKeys("SuperSecretPassword!");
        page.submitButton.click();
        assertThat(textToBePresentInElement(page.errorMassege,"Your username is invalid!"));

        // Negative test if the password is incorrect
        page.usernameField.sendKeys("tomsmith");
        page.passwordField.sendKeys("1234567890");
        page.submitButton.click();
        assertThat(textToBePresentInElement(page.errorMassege,"Your password is invalid!"));

        // Screenshot
        Thread.sleep(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/podobulki/IdeaProjects/SeleniumTests/Screenshot/testNegativeScreen.png"));

    }

}
