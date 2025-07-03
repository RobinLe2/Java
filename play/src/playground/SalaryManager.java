package playground;

public class SalaryManager {

	public static void main(String[] args) {
		SalaryManager manager = new SalaryManager();
		System.out.println("Real monthlySalary:"+manager.getMonthlySalary(20000000));
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double monthlySalary = (yearlySalary / 12.0);
		
		double tax = calculateTax(monthlySalary);
		double pension = calculateNationalPension(monthlySalary);
		double insurance = calculateHealthInsurance(monthlySalary);
		double sumTax = tax + pension + insurance;
		
		
		System.out.println("Tax : " + tax);
		System.out.println("Pension : " + pension);
		System.out.println("Insurance : " + insurance);
		
		monthlySalary -= sumTax;
		return monthlySalary;
}
	public double calculateTax(double monthlySalary) {
		double tax = monthlySalary * (12.5 / 100);
		return tax;
		
	}
	
	public double calculateNationalPension(double monthlySalary) {
		double pension = monthlySalary * (8.1 / 100);
		return pension;
	}
	
	public double calculateHealthInsurance(double monthlySalary) {
		double insurance = monthlySalary * ( 13.5 / 100);
		return insurance;
	}
}
