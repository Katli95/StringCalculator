package stringCalKata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class stringCalcTest{

    @Test
    public void testEmptyString(){
        assertEquals(0, stringCalc.add(""));
    }
    @Test
    public void testOneArgument(){
        assertEquals(1, stringCalc.add("1"));
    }
    @Test
    public void testTwoArguments(){
        assertEquals(3, stringCalc.add("1,2"));
    }
}