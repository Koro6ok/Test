package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UnValidRagistrationWithParametersTest extends BasedTest {
    String email;
    String firstName;
    String lastName;
    String passWord;
    String confirmPassword;
    String phone;
    String organizationName;

    public UnValidRagistrationWithParametersTest(String email, String firstName, String lastName, String passWord, String confirmPassword, String phone, String organizationName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.confirmPassword = confirmPassword;
        this.phone = phone;
        this.organizationName = organizationName;
    }

    @Parameterized.Parameters(name = "Parameters are {0} and {1} and {2} and {3} and {4} and {5} and {6}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"1", "2", "3", "4", "5", "6", "7"},
                {"7", "6", "5", "4", "4", "2", "1"},
                {"a", "b", "c", "d", "e", "f", "g"}
        });
    }

    @Test
    public void unValidRagistrationWithParameters() {
        registrationPage.doRegistration(email, firstName, lastName, passWord, confirmPassword, phone, organizationName);
        Assert.assertFalse("Welcome is present", welcomePage.isWelcomeDisplayed());
    }
}