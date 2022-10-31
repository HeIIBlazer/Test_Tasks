package Tests;

import quadratic.quadratic;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class QuadraticTest {
    
    public QuadraticTest() {}
    
    @Test
    public void quadratic_test1() {
        quadratic obj = new quadratic();
        double result[] = obj.quadratic(2, 12, 7);
        if (result[3] == 0) {
            assertEquals(0.54, result[0], 0.01);
        } else if (result[3] > 0) {
            assertEquals(-0.65, result[1], 0.01);
            assertEquals(-5.34, result[2], 0.01);
        } else {
            assertEquals("discriminant more than 0", result[3]);
        }
    }
    
    @Test
    public void quadratic_test2() {
        quadratic obj = new quadratic();
        double result[] = obj.quadratic(5, 8, 12);
        if (result[3] == 0) {
            assertEquals(-2, result[0], 0.01);
        } else if (result[3] > 0) {
            assertEquals(-7, result[1], 0.01);
            assertEquals(6.58, result[2], 0.01);
        } else {
            assertEquals("discriminant more than 0", result[3]);
        }
    }
    
    @Test
    public void quadratic_test3() {
//        double[] expectedOutput = new double[] {7.4};
        quadratic obj = new quadratic();
        double result[] = obj.quadratic(1, -7, -3);
        if (result[3] == 0) {
            assertEquals(1.58, result[0], 0.01);
        } else if (result[3] > 0) {
            assertEquals(7.40, result[1], 0.01);
            assertEquals(-0.40, result[2], 0.01);
        } else {
            assertEquals("discriminant more than 0", result[3]);
        }
    }
        @Test
    public void quadratic_test4() {
        quadratic obj = new quadratic();
        double result[] = obj.quadratic(1, 15, 31);
        if (result[3] == 0) {
            assertEquals(-2, result[0], 0.01);
        } else if (result[3] > 0) {
            assertEquals(-7, result[1], 0.01);
            assertEquals(6.58, result[2], 0.01);
        } else {
            assertEquals("discriminant more than 0", result[3]);
        }
    }
    
}
