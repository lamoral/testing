package messagep;

import org.junit.Assert;
import org.junit.Test;

public class TestMessage {

    Message mes = new Message("all");

    @Test
    public void testMessage(){
        System.out.println("in testMessage() in TestAdd.TestMessage");
        String expected = "all";
        Assert.assertEquals(expected,mes.getMessage());
    }

    @Test
    public void testPrefixedMessage(){
        System.out.println("in testPrefixedMessage() in TestAdd.TestMessage");
        String expected = "hi all";
        Assert.assertEquals(expected,mes.getPrefixedMessage());
    }
}