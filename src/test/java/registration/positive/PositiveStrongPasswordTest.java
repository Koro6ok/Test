package registration.positive;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import registration.BasedTest;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class PositiveStrongPasswordTest extends BasedTest {
    String passWord;


    public PositiveStrongPasswordTest(String passWord ) {
        this.passWord = passWord;
    }

    @Parameterized.Parameters (name = "Parameters is {0}" )
    public static Collection testData(){
        return Arrays.asList(new Object[][]{
                {"A123$%>?|"},
                {"A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|A123$%>?|"}

        });
    }

    @Test
    public void positiveStrongPassword(){
        registrationPage.setPassword(passWord);

        Assert.assertTrue("Validator is not shown", registrationPage.isFieldValidatorStrongPasswordDisplayed());
    }
}
