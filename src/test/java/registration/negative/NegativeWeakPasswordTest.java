package registration.negative;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class NegativeWeakPasswordTest extends BasedTest {
    private String passWord;

    public NegativeWeakPasswordTest(String passWord) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters(name = "Parameters is {0}")
    public static Collection testData() {
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
    public void negativeWeakPassword() {
        // WHEN
        registrationPage.setPassword(passWord);
        // THEN
        assertThat(registrationPage.isFieldHintWeakPasswordDisplayed())
                .as("Weak hint is shown")
                .isFalse();
    }
}
