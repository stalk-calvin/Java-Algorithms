package org.calvin.Recursion;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OperatorsToTargetTest {

    @Test
    public void shouldHandleFrontZero() {
        List<String> actual = OperatorsToTarget.addOperators("015",5);
        List<String> expected = Lists.newArrayList("0+1*5","0*1+5");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleMultiply() {
        List<String> actual = OperatorsToTarget.addOperators("232",8);
        List<String> expected = Lists.newArrayList("2+3*2","2*3+2");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldHandleZero() {
        List<String> actual = OperatorsToTarget.addOperators("105",5);
        List<String> expected = Lists.newArrayList("1*0+5","10-5");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowForLongString() {
        List<String> actual = OperatorsToTarget.addOperators("123456789",45);
        List<String> expected = Lists.newArrayList("1+2+3+4+5+6+7+8+9",
                "1+2+3+4+5-6*7+8*9",
                "1+2+3+4-5*6+7*8+9",
                "1+2+3+4-5*6-7+8*9",
                "1+2+3-4*5+6*7+8+9",
                "1+2+3-4*5-6+7*8+9",
                "1+2+3-4*5-6-7+8*9",
                "1+2+3*4+5+6*7-8-9",
                "1+2+3*4*5+6-7-8-9",
                "1+2-3+4*5+6*7-8-9",
                "1+2-3-4-5*6+7+8*9",
                "1+2-3*4+5*6+7+8+9",
                "1+2-3*4-5+6*7+8+9",
                "1+2-3*4-5-6+7*8+9",
                "1+2-3*4-5-6-7+8*9",
                "1+2*3+4*5-6+7+8+9",
                "1+2*3*4+5*6+7-8-9",
                "1+2*3*4-5+6*7-8-9",
                "1-2+3*4*5-6-7+8-9",
                "1-2-3*4+5+6+7*8-9",
                "1-2*3+4+5+6*7+8-9",
                "1-2*3+4+5-6+7*8-9",
                "1-2*3+4*5+6+7+8+9",
                "1-2*3+4*5-6*7+8*9",
                "1-2*3-4+5*6+7+8+9",
                "1-2*3-4-5+6*7+8+9",
                "1-2*3-4-5-6+7*8+9",
                "1-2*3-4-5-6-7+8*9",
                "1-2*3*4-5-6+7+8*9",
                "1*2+3+4+5*6+7+8-9",
                "1*2+3+4-5+6*7+8-9",
                "1*2+3+4-5-6+7*8-9",
                "1*2*3+4+5+6+7+8+9",
                "1*2*3+4+5-6*7+8*9",
                "1*2*3+4-5*6+7*8+9",
                "1*2*3+4-5*6-7+8*9",
                "1*2*3-4*5+6*7+8+9",
                "1*2*3-4*5-6+7*8+9",
                "1*2*3-4*5-6-7+8*9",
                "1*2*3*4+5+6-7+8+9"
        );
        assertEquals(expected, actual);
    }
}
