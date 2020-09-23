package messagep;

import org.junit.Assert;
import org.junit.Test;

public class SecondTest {

    Message mes = new Message("all");

    @Test
    public void testPrefixedMessage(){
        System.out.println("in testPrefixedMessage() in TestAdd.SecondTest");
        String expected = "hi all";
        Assert.assertEquals(expected,mes.getPrefixedMessage());
    }
}