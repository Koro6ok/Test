package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class NegativePhoneTest extends BasedTest {
    String phone;

    public NegativePhoneTest(String phone ) {
        this.phone = phone;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {""},
                {" "},
                {"1"},
                {"/"},
                {"aSыvbn"},
                {"123456"},
                {"-380679992211"},
                {"-38067999221"},
                {"-3806799922111"},
                {"06799922111"}

        });
    }
    @Test
    public void negativePhone(){
        registrationPage.setPassword(phone);

        Assert.assertFalse("Validator is shown", registrationPage.isFieldValidatorCorrectPhone());
    }
}
