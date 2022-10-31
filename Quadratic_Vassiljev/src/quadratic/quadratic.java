package quadratic;

public class quadratic {

    public double[] quadratic(double a, double b, double c){
        double discriminant;
        double square = 0.0;
        double square_1 = 0.0;
        double square_2 = 0.0;
        
        discriminant = Math.pow(b, 2) - (4 * a * c);
        
        if (discriminant == 0) {
            square = -b / (2 * a);
        } else if (discriminant > 0) {
            square_1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            square_2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        return new double[]{square, square_1, square_2, discriminant};
        
    
    }

    
}
