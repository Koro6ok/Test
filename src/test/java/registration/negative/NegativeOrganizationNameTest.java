package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import registration.BasedTest;

public class NegativeOrganizationNameTest extends BasedTest {

    @Test
    public void negativeOrganizationName() {
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

        Assert.assertTrue("Welcome is not present", registrationPage.isFieldValidatorErrorOrganizationDisplayed());
    }
}
