import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;


public class TestAdd {

    @Test
    public void testSum() {
        System.out.println("in testSum");
        Calculate calc = new Calculate();
        int a = 4;
        int b = 5;
        int expected = 9;
        int actual = calc.sum(a, b);
        Assert.assertEquals(expected, actual);
    }












}