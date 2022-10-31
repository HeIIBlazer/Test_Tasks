package bank_deposit;

public class Bank {

    public double[] deposit_increase(double percent) {
        final double start_deposit = 1000;
        double final_deposit = 0;
        int month = 0;
        
        while (final_deposit <= 1100) {
            if (percent > 0 && percent < 25 && final_deposit <= 1100) {            
                double num_to_sum = (percent * start_deposit) / 100;
                final_deposit = start_deposit + num_to_sum;
                month++;
            } else {
                return null;
            }
        }
        if(final_deposit >= 1100) {
            return null;
        }

        return new double[]{final_deposit, month};
    }
}
