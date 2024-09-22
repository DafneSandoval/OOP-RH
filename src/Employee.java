
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
		   
		   // CONSTRUCTOR
			public Employee(String firstName, String lasName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked) {
				this.firstName= firstName;
				this.lasName = lasName;
				this.registration= registration;
				this.age=age;
				this.daysWorked=daysWorked;
				this.vacationDaysTaken= vacationDaysTaken;
				this.salary=salary;
				this.yearsWorked=yearsWorked;
			}


		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lasName=" + lasName + ", registration=" + registration
					+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
					+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
		}
		   
} // class Employee
