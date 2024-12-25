package car_engine_selection.model;

public class Car {   // dependent class provide contentment to engine

	private Engine engine;  //encapsulation   by making private and provide getter setter methods
	public Engine getEngine() {
		return engine;
	}
	
	public  void setEngine(Engine engine) {
		this.engine=engine;
	}
}
