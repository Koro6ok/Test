package registration.positive;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import utils.TestData;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PositiveOrganizationNameTest extends BasedTest {
    private String organizationName;

    public PositiveOrganizationNameTest(String organizationName) {
        this.organizationName = organizationName;
    }

    @Parameterized.Parameters(name = "Parameter is {0}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"A"},
                {"a"},
                {"Ы"},
                {"ы"},
                {"AAAAAAAAAA"},
                {"zzzzzzzzzz"}
        });
    }

    @Test
    public void positiveOrganizationName() {
        // WHEN
        registrationPage.openRegistrationPage();
        registrationPage.fillRegistrationForm(TestData.EMAIL,
                TestData.FIRST_NAME,
                TestData.LAST_NAME,
                TestData.PASSWORD,
                TestData.PASSWORD,
                TestData.PHONE,
                organizationName);
        registrationPage.clickButtonVhod();
        // THEN
        SoftAssertions.assertSoftly(soft -> {
            soft.assertThat(registrationPage.isFieldValidatorErrorOrganizationDisplayed())
                    .as("Validator is present")
                    .isFalse();
            soft.assertThat(welcomePage.isWelcomeDisplayed())
                    .as("Welcome is not shown")
                    .isTrue();
        });
    }
}