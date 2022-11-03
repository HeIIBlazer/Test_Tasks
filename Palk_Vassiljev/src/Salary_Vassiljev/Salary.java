package Salary_Vassiljev;

public class Salary {

    public Double Salary(double month_salary){
        double year_salary = month_salary * 12;
        double full_salary = 0;
        double tax = 6000;
        
        if(year_salary >= 14400 && year_salary < 25200){
            double salary = tax - tax / 10800 * (year_salary - 14400);
            double num = (year_salary - salary) * (20/100);
            full_salary = year_salary - num;
            
        } else if(year_salary < 14400){
            double salary = (year_salary - tax) * (20/100);
            full_salary = year_salary - salary;
            
        } else if (year_salary > 25200) {
            double salary = 0;
            double num = (year_salary - tax) * (20/100);
            full_salary = year_salary - num;
        } 
        else {
            return null;
        }
        return full_salary;
    }
}
