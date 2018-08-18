package TestTask;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class GithubTitle extends BaseTest {

    GitHubPage page = new GitHubPage(driver);

    @Test
    public void checkTitleDescriptionH1Pages(){

        // Page http://github.com/
        open("http://github.com/");
        assertTrue(driver.getTitle().contains("The world’s leading software development platform · GitHub"));
        Assert.assertEquals(page.metaDescription.getAttribute("content"),"GitHub brings together the world’s largest community of developers to discover, share, and build better software. From open source projects to private team repositories, we’re your all-in-one platform for collaborative development.");
        assertThat(textToBePresentInElement(page.h1Text,"Built for developers"));

        // Page https://github.com/
        open("https://github.com/");
        assertTrue(driver.getTitle().contains("The world’s leading software development platform · GitHub"));
        Assert.assertEquals(page.metaDescription.getAttribute("content"),"GitHub brings together the world’s largest community of developers to discover, share, and build better software. From open source projects to private team repositories, we’re your all-in-one platform for collaborative development.");
        assertThat(textToBePresentInElement(page.h1Text,"Built for developers"));

        // Page https://www.github.com/
        open("https://www.github.com/");
        assertTrue(driver.getTitle().contains("The world’s leading software development platform · GitHub"));
        Assert.assertEquals(page.metaDescription.getAttribute("content"),"GitHub brings together the world’s largest community of developers to discover, share, and build better software. From open source projects to private team repositories, we’re your all-in-one platform for collaborative development.");
        assertThat(textToBePresentInElement(page.h1Text,"Built for developers"));

        // Page https://www.github.com/test/
        open("https://www.github.com/test/");
        assertTrue(driver.getTitle().contains("test · GitHub"));
        Assert.assertEquals(page.metaDescription.getAttribute("content"),"GitHub is where people build software. More than 28 million people use GitHub to discover, fork, and contribute to over 85 million projects.");
        assertThat(textToBePresentInElement(page.h1Text2,"test"));

        // Page https://github.com/testlololo
        open("https://github.com/testlololo");
        assertTrue(driver.getTitle().contains("Page not found · GitHub"));
        page.h1Text3.isEnabled();

        // Page https://github.com/test?lol
        open("https://github.com/test?lol");
        assertTrue(driver.getTitle().contains("test · GitHub"));
        Assert.assertEquals(page.metaDescription.getAttribute("content"),"GitHub is where people build software. More than 28 million people use GitHub to discover, fork, and contribute to over 85 million projects.");
        assertThat(textToBePresentInElement(page.h1Text2,"test"));

    }
}
