import org.junit.*;


public class TestCalculate {

    @Test
    public void testSum(){
        System.out.println("Method associated with testSum");
        Calculate calc = new Calculate();
        int a= 4;
        int b= 5;
        int expected= 9;
        int actual= calc.sum(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDiff(){
        System.out.println("Method associated with testDiff");
        Calculate calc = new Calculate();
        int a= 4;
        int b= 5;
        int expected= -1;
        int actual= calc.diff(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testDiv(){
        Calculate calc = new Calculate();
        int a= 4;
        int b= 2;
        int expected= 2;
        int actual= calc.divide(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivZero(){
        Calculate calc = new Calculate();
        int a= 4;
        int b= 0;
        int actual = calc.divide(a,b);
    }

    @Before
    public void runBeforeEveryTest(){
        System.out.println("Method associated with @before annotation");
    }

    @After
    public void runAfterEveryTest(){
        System.out.println("Method associated with @after annotation");
    }

    @BeforeClass
    public static void runBeforeClass(){
        System.out.println("Method associated with @BeforeClass annotation");
    }

    @AfterClass
    public static void runAfterClass(){
        System.out.println("Method associated with @AfterClass annotation");
    }

}