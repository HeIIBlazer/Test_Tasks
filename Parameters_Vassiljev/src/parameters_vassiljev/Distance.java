package parameters_vassiljev;


public class Distance {

    public double calculate_distance(double x1, double x2, double y1, double y2) {
        double result = Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));
        return result;
    }
    
}
