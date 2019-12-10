package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import utils.TestData;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PositiveFirstLastNameTest extends BasedTest {
    private String firstName;
    private String lastName;

    public PositiveFirstLastNameTest (String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

    @Parameterized.Parameters(name = "Parameters are {0} and {1}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"A","A"},
                {"a","a"},
                {"Ы","Ы"},
                {"ы","ы"},
                {"AAAAAAAAAA","AAAAAAAAAA"},
                {"zzzzzzzzzz","zzzzzzzzzz"}
        });
    }

    @Test
    public void positiveFirstLastName() {
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
        Assert.assertFalse("Validator is shown", registrationPage.isFieldValidatorErrorFirstNameDisplayed());
        Assert.assertFalse("Validator is shown", registrationPage.isFieldValidatorErrorLastNameDisplayed());
        Assert.assertTrue("Welcome is not shown", welcomePage.isWelcomeDisplayed());
    }
}