import org.junit.*;


public class TestDiff {

    @Test
    public void testDiff() {
        System.out.println("in testDiff");
        Calculate calc = new Calculate();
        int a = 4;
        int b = 5;
        int expected = -1;
        int actual = calc.diff(a, b);
        Assert.assertEquals(expected, actual);
    }
}