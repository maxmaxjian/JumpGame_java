import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[] input;
    private boolean expected;
    private Solution soln = new Solution1();

    public SolutionTest(int[] input, boolean output) {
        this.input = input;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
//            {new int[]{2,3,1,1,4}, true},
//            {new int[]{3,2,1,0,4}, false},
                {new int[]{2,0}, true}
        });
    }

    @Test
    public void testJump() {
        assertEquals(expected, soln.canJump(input));
    }
}