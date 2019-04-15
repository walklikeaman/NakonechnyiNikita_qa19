import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloTest {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.trello.com");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.findElement(By.cssSelector("[href='/login']")).click();

        webDriver.findElement(By.name("user")).click();
        webDriver.findElement(By.name("user")).clear();
        webDriver.findElement(By.name("user")).sendKeys("nakonechnyi.n@gmail.com");

        webDriver.findElement(By.id("password")).click();
        webDriver.findElement(By.id("password")).clear();
        webDriver.findElement(By.id("password")).sendKeys("Elton1904");

        webDriver.findElement(By.id("login")).click();
    }

    @Test
    public void createBoardtest() {
        webDriver.findElement(By.cssSelector("a.js-open-add-menu")).click();
        webDriver.findElement(By.className("js-new-board")).click();

        webDriver.findElement(By.cssSelector("[class='subtle-input']")).click();
        webDriver.findElement(By.cssSelector("[class='subtle-input']")).clear();
        webDriver.findElement(By.cssSelector("[class='subtle-input']")).sendKeys("new");

        webDriver.findElement(By.cssSelector("[type='submit']")).click();
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}
