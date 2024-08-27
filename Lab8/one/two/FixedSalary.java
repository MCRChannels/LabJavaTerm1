package two;

public class FixedSalary extends Employee {
    private double monthlySalary;

    public FixedSalary(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        this.monthlySalary = salary;
    }


    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return String.format("Fixed salary employee: %s\nmonthly salary: $%.2f",
                super.toString(), monthlySalary);
    }
    
    
    public Card getCard() {
    	return this.getSa().getCard();
    }
}