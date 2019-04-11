import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WikipediaOpenSiteTest {

    WebDriver webDriver;

    @BeforeTest
    public void setUp() {
        this.webDriver = new ChromeDriver();
    }

    @Test
    public void openWikiTest() {
        webDriver.get("https://en.wikipedia.org/wiki/Main_Page");

    }


}
