package Tests;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import parameters_vassiljev.Distance;

@RunWith(Parameterized.class)
public class Distance_Test {
    
    @Parameters
    public static Collection distance_values() {
        return Arrays.asList(new Object[][]{
            {1, 2, 3, 4, 2},
            {5, 8, 7, 3, 4.2},
            {9, 1, -11, 2, 13}
        });
    }  
    double x1, x2, y1, y2, final_distance;
    public Distance_Test(double x1, double x2, double y1, double y2, double final_distance) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.final_distance = final_distance;
    }
    
    @Test
    public void distance_test() {
        double exp = final_distance;
        Distance obj = new Distance();
        double result = obj.calculate_distance(x1, x2, y1, y2);
        assertEquals(exp, result, 0.01);
    }
    
}
