package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class NegativeWeakPasswordTest extends BasedTest {
    private String passWord;

    public NegativeWeakPasswordTest(String passWord ) {
                this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {" "},
                {"      "},
                {"1"},
                {"/"},
                {"ASDFGH"},
                {"asdfgh"},
                {"ЫЫЫЫЫЫ"},
                {"ыыыыыы"},
                {"123456"}
        });
    }

    @Test
    public void negativeWeakPassword(){
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        Assert.assertFalse("Hint is shown", registrationPage.isFieldHintWeakPasswordDisplayed());
    }
}
