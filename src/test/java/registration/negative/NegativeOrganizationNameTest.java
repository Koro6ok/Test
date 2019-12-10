package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import utils.TestData;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NegativeOrganizationNameTest extends BasedTest {
    private String organizationName;

    public NegativeOrganizationNameTest (String organizationName){
        this.organizationName = organizationName;
    }
    @Parameterized.Parameters(name = "Parameter is {0}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"|"},
                {" "},
                {"~!@#$%^&*<>|"}
        });
    }

    @Test
    public void negativeOrganizationName() {
        // WHEN
        registrationPage.openRegistrationPage();
        registrationPage.fillRegistrationForm (TestData.EMAIL,
                TestData.FIRST_NAME,
                TestData.LAST_NAME,
                TestData.PASSWORD,
                TestData.PASSWORD,
                TestData.PHONE,
                organizationName);
        registrationPage.clickButtonVhod();
        // THEN
        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorErrorOrganizationDisplayed());
        Assert.assertFalse("Welcome is shown", welcomePage.isWelcomeDisplayed());
    }
}