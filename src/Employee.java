
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
		      return retirementAge - age;
		     // int yearsWorked = 40;
		   }

		   public int vacationTimeLeft(){
		       int vacationDaysleft = (int) ((daysWorked /360)* (30 - vacationDaysTaken));
			return Math.max(0, vacationDaysleft); //Poner el 0 asegura que el resultado nunca sea menor a 0
		   }

		   public double calculateBonus(){
		      double bonus = 2.2*salary;
			return bonus;
		   }
	//Methods
} // class Employee
