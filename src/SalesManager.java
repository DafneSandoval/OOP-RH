
public class SalesManager extends SalesRep {
	public SalesManager(String firstName, String lasName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked) {
		super(firstName, lasName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// Super constructor 
	}
	double calculateTotalComissions;
	   public double calculateComission(){
		       return 0.03 * salesMade;
		   }

} // class SalesManager
