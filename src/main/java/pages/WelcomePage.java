package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends ParentPage {
    @FindBy(xpath = ".//div[@class='img_wrap' and @style!='display: none;']//h1")
    private WebElement welcome;

    public WelcomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isWelcomeDisplayed() {
        return actionsWithOurElements.isElementDisplayed(welcome);
    }
}
