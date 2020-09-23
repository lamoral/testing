import org.junit.*;


import java.util.NoSuchElementException;

public class TestPersonList {

    private PersonList listp= new PersonList();

    @Before
    public void initialize(){
        listp.add("abc");
        listp.add("xyz");
    }

    @After
    public void destroy(){
        listp.removeAll();
    }

    @Test
    public void testSizeMethod(){
        int expected= 2;
        Assert.assertEquals(expected,listp.size());
    }

    @Test
    public void testAddMethod(){
        listp.add("pqr");
        int expected= 3;
        Assert.assertEquals(expected,listp.size());
    }

    @Test
    public void testRemoveMethod(){
        listp.remove("xyz");
        int expected= 1;
        Assert.assertEquals(expected,listp.size());
    }

    @Test(expected= NoSuchElementException.class)
    public void testRemoveMethodException(){
        listp.remove("abc123");
        int expected= 2;
        Assert.assertEquals(expected,listp.size());
    }
}
