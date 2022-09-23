import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class karateTest {
    @Test
    public void testRunner(){
        Results result = Runner.path("classpath: tests").tags("~@ignore").parallel(1);
        assertEquals(result.getFailCount(),result.getErrorMessages());
    }
}
