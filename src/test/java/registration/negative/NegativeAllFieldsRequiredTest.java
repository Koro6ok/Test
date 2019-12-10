package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import registration.BasedTest;

public class NegativeAllFieldsRequiredTest extends BasedTest {

    @Test
    public void negativeAllFieldsRequired() {
        registrationPage.openRegistrationPage();
        registrationPage.isButtonVhodDisplayed();
        registrationPage.clickButtonVhod();

        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorEmailDisplayed());
        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorFirstNameDisplayed());
        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorLastNameDisplayed());
        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorPasswordDisplayed());
        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorPhoneDisplayed());
        Assert.assertTrue("Validator is not be present", registrationPage.isFieldValidatorOrganizationNameDisplayed());
    }
}


