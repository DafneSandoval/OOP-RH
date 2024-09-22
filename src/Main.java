
public class Main {

	public static void main(String[] args) {
		Employee dolores = new Employee("Dolores", "Galicia", 63524, 29, 600, 9, 1000.00, 15);
       System.out.println(dolores);
       
    
       System.out.println("Tiempo hasta la jubilación: " + dolores.timeToRetirement() + " años");
     //Tiempo hasta la jubilación
       
       
       System.out.println("Días de vacaciones restantes: " + dolores.vacationTimeLeft() + " días");
    // Vacaciones restantes
      
       System.out.println("Bono: " + dolores.calculateBonus() + "MXN");
       // Bono
       
       
       SalesRep galileo = new SalesRep("Galileo", "Zugasti", 77789, 30, 420, 12, 8000.00, 3);
       System.out.println(galileo);
       System.out.println("Comisión del SalesRep: " + galileo.calculateComission() + "MXN");
       //calculateComission
       
       
       SalesManager katy = new SalesManager("Katia", "Duarte", 52482, 40, 600, 10, 12000.00, 50);
       System.out.println(katy);
       System.out.println("Comisión del SalesManager: " + katy.calculateComission() + "MXN");
       
}// class Main
}