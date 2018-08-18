package TestTask;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class TestTask extends BaseTestTask {

    GeneralPage page = new GeneralPage(driver);

    @Test
    public void testTask() throws IOException, InterruptedException {
        open("http://the-internet.herokuapp.com/");

        page.formAuthentication.click();
        page.usernameField.sendKeys("testUserName");
        page.passwordField.sendKeys("1234567890");
        page.submitButton.click();
        Thread.sleep(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/home/podobulki/IdeaProjects/selenium_tests_petition/Screenshot/testScreen.png"));

    }

}
