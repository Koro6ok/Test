package registration.negative;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import registration.BasedTest;

public class NegativeAllFieldsRequiredTest extends BasedTest {

    @Test
    public void negativeAllFieldsRequired() {
        // WHEN
        registrationPage.openRegistrationPage();
        registrationPage.isButtonVhodDisplayed();
        registrationPage.clickButtonVhod();
        // THEN

        SoftAssertions.assertSoftly(soft -> {
            soft.assertThat(registrationPage.isFieldValidatorEmailDisplayed())
                    .as("Validator is not present")
                    .isTrue();
            soft.assertThat(registrationPage.isFieldValidatorFirstNameDisplayed())
                    .as("Validator is not present")
                    .isTrue();
            soft.assertThat(registrationPage.isFieldValidatorLastNameDisplayed())
                    .as("Validator is not present")
                    .isTrue();
            soft.assertThat(registrationPage.isFieldValidatorPasswordDisplayed())
                    .as("Validator is not present")
                    .isTrue();
            soft.assertThat(registrationPage.isFieldValidatorPhoneDisplayed())
                    .as("Validator is not present")
                    .isTrue();
            soft.assertThat(registrationPage.isFieldValidatorOrganizationNameDisplayed())
                    .as("Validator is not present")
                    .isTrue();
        });
    }
}


