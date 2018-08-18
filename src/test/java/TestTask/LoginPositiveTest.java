package TestTask;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class LoginPositiveTest extends BaseTestTask {

    GeneralPage page = new GeneralPage(driver);

    @Test
    public void positiveTest() throws IOException {
        open("http://the-internet.herokuapp.com/");

        page.formAuthentication.click();
        page.usernameField.sendKeys("tomsmith");
        page.passwordField.sendKeys("SuperSecretPassword!");
        page.submitButton.click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/podobulki/IdeaProjects/SeleniumTest/Screenshot/testPositiveScreen.png"));
    }
}
