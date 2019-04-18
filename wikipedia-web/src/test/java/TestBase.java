import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = new ChromeDriver();
        openURL();
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }

    public void openURL() {
        webDriver.get("https://www.wikipedia.org");
    }

    public void confirmLogin() {
        click(By.xpath("//button[@value='Log in']"));
    }

    public void fillLoginForm(String login, String password) {
        type(By.name("wpName"), login);

        type(By.id("wpPassword1"), password);
    }

    public void type(By locator, String text) {
        click(locator);
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(text);
    }

    public void initLogin() {
        click(By.cssSelector("#pt-login"));
    }

    public void selectLanguage() {
        click(By.cssSelector("[href='//en.wikipedia.org/']"));
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }
    public void addToFavourites() {
        click(By.id("ca-watch"));
    }

    public void searchArticle(String article) {
        type(By.name("search"), article);
        click(By.name("go"));
    }


}
