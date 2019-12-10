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
    String phone;

    public PositivePhoneTest(String phone ) {
        this.phone = phone;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"+380639992211"},
                {"+380679992211"},
                {"+380979992211"},

        });
    }

    @Test
    public void positivePhone(){
        registrationPage.setPassword(phone);

        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorCorrectPhone());
    }
}
