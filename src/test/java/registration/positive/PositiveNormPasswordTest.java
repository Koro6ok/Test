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
    private String passWord;

    public PositiveNormPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameter is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"123456"},
                {"AAAAAA"},
                {"aaaaaa"},
                {"123456789"},
                {"AAAAAAAAA"},
                {"aaaaaaaaa"},
                {"AAbc12"},
                {"AAbc12345"},
                {"ЫЫЫЫЫЫ"},
                {"ыыыыыы"},
                {"ЫЫЫЫЫЫЫЫЫ"},
                {"ыыыыыыыыы"},
                {"ЫЫыы12"},
                {"ЫЫыы12345"}
        });
    }

    @Test
    public void positiveNormPassword(){
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        Assert.assertTrue("Hint is not shown", registrationPage.isFieldHintNormalPasswordDisplayed());
    }
}
