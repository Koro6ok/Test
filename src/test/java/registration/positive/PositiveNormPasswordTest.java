package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PositiveNormPasswordTest extends BasedTest {
    String passWord;

    public PositiveNormPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"123Abc"},
                {"Abc123456"}

        });
    }

    @Test
    public void positiveNormPassword(){
        registrationPage.setPassword(passWord);

        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorNormalPasswordDisplayed());
    }
}
