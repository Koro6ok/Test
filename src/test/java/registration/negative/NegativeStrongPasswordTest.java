package registration.negative;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class NegativeStrongPasswordTest extends BasedTest {
    private String passWord;

    public NegativeStrongPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"         "},
                {"123456789"},
                {"AAAAAAAAA"},
                {"aaaaaaaaa"},
                {"ЫЫЫЫЫыыыы"},
                {"ыыыыыЫЫЫЫ"},
                {"Az1234567"},
                {"Az1~!@$/|"}

        });
    }

    @Test
    public void negativeStrongPassword(){
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        assertThat(registrationPage.isFieldHintStrongPasswordDisplayed())
                .as("Strong hint is shown")
                .isFalse();
    }
}
