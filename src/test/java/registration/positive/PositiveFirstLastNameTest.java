package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import registration.BasedTest;

public class PositiveFirstLastNameTest extends BasedTest {

    @Test
    public void positiveFirstLastName() {
        registrationPage.openRegistrationPage();
        registrationPage.enterEmailAddress("qwe@gmail.com");
        registrationPage.enterFirstName("qweQWE");
        registrationPage.enterLastName("qweQWE");
        registrationPage.enterPassword("12345");
        registrationPage.enterConfirmPassword("12345");
        registrationPage.enterPhone("+380639992211");
        registrationPage.enterOrganizationName("My_organization");
        registrationPage.isButtonVhodDisplayed();
        registrationPage.clickButtonVhod();

        Assert.assertTrue("Welcome is not present", welcomePage.isWelcomeDisplayed());
    }
}