

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestNumbers {

    private static Integer edge = 1000;
    private static Integer totalSum= 233168;

    @Test
    public void testToTen(){

        assertEquals(totalSum, MyTest.getTotalSum(edge));
    }

}
