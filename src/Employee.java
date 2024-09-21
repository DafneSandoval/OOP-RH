
public class Employee {
	
	// Attributes
	String firstName;
	String lasName;
	int registration;
	int age;
	int daysWorked;
	int vacationDaysTaken;
	double salary;
	int yearsWorked;
	
	// IMPLEMENT METHODS 
	   public int timeToRetirement(){
		      int retirementAge = 60;
		      int yearsWorked = 40;
		   }

		   public int vacationTimeLeft(){
		       int daysWorked =360 * 30 - vacationDaysTaken;
		   }

		   public int calculateBonus(){
		      int bonus = 2.2*salary;
		   }
	//Methods
	
	 

} // class Employee
