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
        webDriver.get("https://www.trello.com");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickLoginButton();
        login("nakonechnyi.n@gmail.com", "Elton1904");
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }

    public void click(By locator) {
        webDriver.findElement(locator).click();
    }

    public void login(String login, String password) {
        type(By.name("user"), login);

        type(By.id("password"), password);

        click(By.id("login"));
    }

    public void type(By locator, String s) {
        click(locator);
        webDriver.findElement(locator).clear();
        webDriver.findElement(locator).sendKeys(s);
    }

    public void clickLoginButton() {
        click(By.cssSelector("[href='/login']"));
    }

    public void submitBoardCreation() {
        click(By.cssSelector("[type='submit']"));
    }

    public void typeBoardTitle() {
        type(By.cssSelector("[class='subtle-input']"), "new");
    }

    public void initBoardCreationFromHeader() {
        clickOnPlusButtonOnHeader();
        click(By.className("js-new-board"));
    }

    public void clickOnPlusButtonOnHeader() {
        click(By.cssSelector("a.js-open-add-menu"));
    }
}
