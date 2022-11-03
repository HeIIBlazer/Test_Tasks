package Palk_Vassiljev;

public class Palk {

    public Double Palk(double salary_month){
        double salary_year = salary_month * 12;
        double final_salary = 0;
        double tax = 6000;
        
        if(salary_year < 14400){
            double salary = (salary_year - tax) * (20/100);
            final_salary = salary_year - salary;
        } 
        else if(salary_year >= 14400 && salary_year < 25200){
            double salary = tax - tax / 10800 * (salary_year - 14400);
            double num = (salary_year - salary) * (20/100);
            final_salary = salary_year - num;
        }
        else if (salary_year > 25200) {
            double salary = 0;
            double num = (salary_year - tax) * (20/100);
            final_salary = salary_year - num;
        } 
        else {
            return null;
        }
        return final_salary;
    }
}
