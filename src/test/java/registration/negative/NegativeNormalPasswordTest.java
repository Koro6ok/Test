package registration.negative;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class NegativeNormalPasswordTest extends BasedTest {
    private String passWord;

    public NegativeNormalPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"     "},
                {"          "},
                {"12345"},
                {"1234567890"},
                {"AAAAA"},
                {"aaaaa"},
                {"ЫЫЫЫЫ"},
                {"ыыыыы"},
                {"AAAAAAAAAA"},
                {"aaaaaaaaaa"},
                {"ЫЫЫЫЫЫЫЫЫЫ"},
                {"ыыыыыЫЫЫЫЫ"},
                {"Az123"},
                {"Az12345678"},
                {"Az1~/|"},
                {"Az1~!@$/|"}
        });
    }

    @Test
    public void negativeNormalPassword(){
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        Assert.assertFalse("Hint is shown", registrationPage.isFieldHintNormalPasswordDisplayed());
    }
}
