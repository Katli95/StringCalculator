package stringCalKata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.security.InvalidParameterException;

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
    @Test
    public void testManyArguments(){
        assertEquals(36, stringCalc.add("1,2,3,4,5,6,7,8"));
    }
    @Test
    public void testCommaAndNewline(){
        assertEquals(6, stringCalc.add("1\n2,3"));
    }
    @Test
    public void testThrownErrorForNeg(){
        try{
            stringCalc.add("-1\n2");
            fail("Didn't throw error for first arg = -1");
        }
        catch(IllegalArgumentException expected){
            if(!expected.getMessage().equals("Negatives not allowed: -1"))
                fail("Threw incorrect error for first arg -1");
        }
    }
    @Test
    public void testThrownErrorForMultipleNeg(){
        try{
            stringCalc.add("-1,1,-2,2,-3,3");
            fail("Didn't throw error for args: -1,-2,-3");
        }
        catch(IllegalArgumentException expected){
            if(!expected.getMessage().equals("Negatives not allowed: -1,-2,-3"))
                fail("Threw incorrect error for args: -1,-2,-3");
        }
    }
    @Test
    public void testOverOneThousand(){
        assertEquals(1003, stringCalc.add("1000,3,1003"));
    }
}