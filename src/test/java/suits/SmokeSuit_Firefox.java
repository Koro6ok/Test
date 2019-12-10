package suits;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import registration.negative.*;
import registration.positive.*;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {PositiveRegistrationTest.class,
                PositiveFirstLastNameTest.class,
                PositiveWeakPasswordTest.class,
                PositiveNormPasswordTest.class,
                PositiveStrongPasswordTest.class,
                PositivePhoneTest.class,
                PositiveOrganizationNameTest.class,

                UnValidRagistrationWithParametersTest.class,
                NegativeAllFieldsRequiredTest.class,
                NegativeFirstLastNameTest.class,
                NegativeWeakPasswordTest.class,
                NegativeNormalPasswordTest.class,
                NegativeStrongPasswordTest.class,
                NegativePhoneTest.class,
                NegativeOrganizationNameTest.class,

        }
)

public class SmokeSuit_Firefox {
}
