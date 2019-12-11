package registration.positive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class PositiveStrongPasswordTest extends BasedTest {
    private String passWord;


    public PositiveStrongPasswordTest(String passWord) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters(name = "Parameter is {0}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"1234567890"},
                {"AAAAAAAAAA"},
                {"aaaaaaaaaa"},
                {"1234567891234567891234567891234567891234567891234567891234567890"},
                {"AAbc12?|/*"},
                {"AAbc123456789012345678901234567890123456789012345678901234567890"},
                {"ЫЫЫЫЫЫЫЫЫЫ"},
                {"ыыыыыыЫЫЫЫ"},
                {"ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ"},
                {"ыыыыыыыыыЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ"},
                {"ЫЫыы12?|/*"},
                {"ЫЫыы12?|/*~!@#$%^&*()<>?"},
                {"ЫЫыы12?|/*~!@#$%^&*()<>?zzZZ"}
        });
    }

    @Test
    public void positiveStrongPassword() {
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        assertThat(registrationPage.isFieldHintStrongPasswordDisplayed())
                .as("Incorrect hint is shown")
                .isTrue();
    }
}
