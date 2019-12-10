package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import registration.BasedTest;
import utils.TestData;

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
        Assert.assertTrue("Welcome is not present", welcomePage.isWelcomeDisplayed());
    }
}
