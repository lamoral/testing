import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses(
        {TestAdd.class,
        TestDiff.class,
        TestDiv.class
        }
)

public class CalcSuite {
}
