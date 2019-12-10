package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import registration.BasedTest;

public class NegativeFirstLastNameTest extends BasedTest {

    @Test
    public void negativeFirstLastName() {
        registrationPage.openRegistrationPage();
        registrationPage.enterEmailAddress("qwe@gmail.com");
        registrationPage.enterFirstName("123/@*-+.?>|}{[]}");
        registrationPage.enterLastName("123/@*-+.?>|}{[]}");
        registrationPage.enterPassword("12345");
        registrationPage.enterConfirmPassword("12345");
        registrationPage.enterPhone("+380639992211");
        registrationPage.enterOrganizationName("My_organization");
        registrationPage.isButtonVhodDisplayed();
        registrationPage.clickButtonVhod();

        Assert.assertFalse("Welcome should not be present", welcomePage.isWelcomeDisplayed());
    }
}
