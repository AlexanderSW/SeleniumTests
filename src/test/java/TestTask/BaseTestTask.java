package TestTask;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestTask {
    public static WebDriver driver;

    public void open(String url) {driver.get(url);}

    @BeforeClass
    public static void setupDev() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/podobulki/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
