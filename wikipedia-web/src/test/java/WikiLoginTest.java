import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WikiLoginTest {

    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.wikipedia.org");
    }

    @Test
    public void testLogin() {
        webDriver.findElement(By.cssSelector("#js-link-box-en")).click();
        webDriver.findElement(By.cssSelector("#pt-login")).click();

        webDriver.findElement(By.name("wpName")).click();
        webDriver.findElement(By.name("wpName")).clear();
        webDriver.findElement(By.name("wpName")).sendKeys();

        webDriver.findElement(By.id("wpPassword"));

        webDriver.findElement(By.cssSelector("button[value='Log In']")).click();


    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}
