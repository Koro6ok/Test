package registration.positive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;
import java.util.Arrays;
import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(Parameterized.class)
public class PositiveWeakPasswordTest extends BasedTest {
    private String password;

    public PositiveWeakPasswordTest(String passWord) {
        this.password = passWord;
    }

    @Parameterized.Parameters(name = "Parameter is {0}")
    public static Collection testData() {
        return Arrays.asList(new Object[][]{
                {"A"},
                {"z"},
                {"Я"},
                {"ы"},
                {"asdzx"},
                {"ASDZX"},
                {"ЫЫЫЫІ"},
                {"фывяч"}
        });
    }

    @Test
    public void positiveWeakPassword() {
        // WHEN
        registrationPage.setPassword(password);
        // THEN
        assertThat(registrationPage.isFieldHintWeakPasswordDisplayed())
                .as("Incorrect hint is shown")
                .isTrue();
    }
}
