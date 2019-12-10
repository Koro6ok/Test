package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class PositivePhoneTest extends BasedTest {
    private String phone;

    public PositivePhoneTest(String phone ) {
        this.phone = phone;
    }

    @Parameterized.Parameters (name = "Parameter is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"+380039992211"},
                {"+380679992211"},
                {"+380979992211"}
        });
    }

    @Test
    public void positivePhone(){
        // WHEN
        registrationPage.setPhone(phone);
        // THEN
        Assert.assertTrue("Validator is shown", registrationPage.isFieldValidatorCorrectPhone());
    }
}
