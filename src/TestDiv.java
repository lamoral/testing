import org.junit.*;


public class TestDiv {


    @Test
    public void testDiv() {
        System.out.println("in testDiv in class TestDiv");
        Calculate calc = new Calculate();
        int a = 4;
        int b = 2;
        int expected = 2;
        int actual = calc.divide(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivZero() {
        System.out.println("in testDivZero in class TestDiv");
        Calculate calc = new Calculate();
        int a = 4;
        int b = 0;
        int actual = calc.divide(a, b);
    }
}