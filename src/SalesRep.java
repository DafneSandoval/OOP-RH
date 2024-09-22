
public class SalesRep extends Employee{
	
	public SalesRep(String firstName, String lasName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super(firstName, lasName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		// Super constructor 
	}

	// Attributes
	double salesMade;
			   
		//Methods
	   public double calculateComission(){
		      double comission = 0.1 * salesMade;
			return comission;
		   }// calculateComission

	@Override
	public String toString() {
		return "SalesRep [firstName=" + firstName + ", lasName=" + lasName + ", registration=" + registration + ", age="
				+ age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken + ", salary=" + salary
				+ ", yearsWorked=" + yearsWorked + ", calculateComission()=" + calculateComission() + "]";
	}// to string

} //SalesRep
