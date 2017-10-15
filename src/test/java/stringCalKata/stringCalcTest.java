package stringCalKata;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class stringCalcTest{

    @Test
    public void testEmptyString(){
        assertEquals(0, stringCalc.add(""));
        assertEquals(1, stringCalc.add("1"));
        assertEquals(3, stringCalc.add("1,2"));
    }

    public static void main(String args[]){

    }
}