import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenEbay {
    WebDriver webDriver;

    @Test
    public void openSite() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://www.ebay.com");
    }

}
