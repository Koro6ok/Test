package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class NegativeStrongPasswordTest extends BasedTest {
    String passWord;

    public NegativeStrongPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"SSsomething"},

        });
    }

    @Test
    public void negativeStrongPassword(){
        registrationPage.setPassword(passWord);

        Assert.assertTrue("Validator is shown", registrationPage.isFieldValidatorStrongPasswordDisplayed());
    }
}
