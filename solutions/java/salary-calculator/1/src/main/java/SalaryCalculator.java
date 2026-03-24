public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = daysSkipped >= 5  ? 1*0.85 : 1;
        return multiplier;
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.salaryMultiplier() method");
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = productsSold >= 20 ? 1*13 : 1*10;
        return multiplier;
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusMultiplier() method");
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus = bonusMultiplier(productsSold) >= 13 ? productsSold * 13 : productsSold * 10;
        return bonus;
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductsSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (salaryMultiplier(daysSkipped)*1000 + bonusForProductsSold(productsSold)) >= 2000 ? 2000 :(salaryMultiplier(daysSkipped)*1000 + bonusForProductsSold(productsSold));
        return salary;
        //throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}
