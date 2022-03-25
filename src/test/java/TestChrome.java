import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestChrome {

    static Capabilities chromeCapabilities = DesiredCapabilities.chrome();

@Test
    public void main() throws MalformedURLException {
        WebDriver chrome = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeCapabilities);


        // run against chrome
        chrome.get("https://www.google.com");
        System.out.println(chrome.getTitle());

        chrome.quit();
    }
}