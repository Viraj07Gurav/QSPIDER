package car_engine_selection.model;

public class DieselEngine implements Engine { //used inheritance by using  Is-a relationship 

	@Override
	public void engineCheck() {   // Polymorphism by provinding implementation for unimplemented method
		// TODO Auto-generated method stub
		System.out.println("Diesel Engine");
		
	}
	
}
