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
public class NegativeFirstLastNameTest extends BasedTest {
    private String firstName;
    private String lastName;

    public NegativeFirstLastNameTest (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Parameterized.Parameters(name = "Parameters are {0} and {1}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"|","|"},
                {" "," "},
                {"~!@#$%^&*<>|","~!@#$%^&*<>|"},
        });
    }

    @Test
    public void negativeFirstLastName() {
        // WHEN
        registrationPage.openRegistrationPage();
        registrationPage.fillRegistrationForm (TestData.EMAIL,
                firstName,
                lastName,
                TestData.PASSWORD,
                TestData.PASSWORD,
                TestData.PHONE,
                TestData.ORG_NAME);
        registrationPage.clickButtonVhod();
        // THEN
        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorErrorFirstNameDisplayed());
        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorErrorLastNameDisplayed());
        Assert.assertFalse("Welcome is shown", welcomePage.isWelcomeDisplayed());
    }
}