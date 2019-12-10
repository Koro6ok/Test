package registration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pages.RegistrationPage;
import pages.WelcomePage;

import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class BasedTest {
    private WebDriver webDriver;
    protected RegistrationPage registrationPage;
    protected WelcomePage welcomePage;

    @Before
    public void setUp() {
        final String browser = System.getProperty("browser");
        driverInit(browser);
        registrationPage = new RegistrationPage(webDriver);
        welcomePage = new WelcomePage(webDriver);
    }

    @After
    public void tearDown() {

        webDriver.quit();
    }

    private void driverInit(String browser) {
        if ("chrome".equals(browser) || browser == null) {
            File file = new File("./src/drivers/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            webDriver = new ChromeDriver();
        } else if ("firefox".equals(browser)) {
            File file = new File("./src/drivers/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
            FirefoxOptions profile = new FirefoxOptions();
            profile.addPreference("browser.startup.page", 0);
            profile.addPreference("browser.startup.homepage_override.mstone", "ignore");
            webDriver = new FirefoxDriver();
        } else {
            Assert.fail("Wrong browser name");
        }
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

