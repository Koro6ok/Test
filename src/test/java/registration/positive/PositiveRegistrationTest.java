package registration.positive;

import org.junit.Test;
import registration.BasedTest;
import utils.TestData;
import static org.assertj.core.api.Assertions.assertThat;
public class PositiveRegistrationTest extends BasedTest {

    @Test
    public void validRegistration() {
        // WHEN
        registrationPage.openRegistrationPage();
        registrationPage.fillRegistrationForm(TestData.EMAIL,
                TestData.FIRST_NAME,
                TestData.LAST_NAME,
                TestData.PASSWORD,
                TestData.PASSWORD,
                TestData.PHONE,
                TestData.ORG_NAME);
        registrationPage.clickButtonVhod();
        // THEN
        assertThat(welcomePage.isWelcomeDisplayed())
                .as("Welcome is not shown")
                .isTrue();
    }
}
