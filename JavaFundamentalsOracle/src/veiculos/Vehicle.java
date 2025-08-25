package veiculos;

public class Vehicle {

	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	private String ChassisNo;
	private String model;
	
	public Vehicle(String model) {
		super();
		this.model = model;
		numVehicles++;
		ChassisNo = "ch" + numVehicles;
		System.out.println("Vehicle manufactured");		
	}//constructor

	public String getChassisNo() {
		return ChassisNo;
	}//getters

	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}//setters

	public String getModel() {
		return model;
	}//getters

	public void setModel(String model) {
		this.model = model;
	}//setters	

	public static String getMAKE() {
		return MAKE;
	}//getters

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}//setters

	@Override
	public String toString() {
		return "The vehicle is manufactured by: "+ MAKE +"\nThe model type is "+ model +
				"\nThe chassis number is "+ ChassisNo +"\nThe engine make is "+ Engine.getMake() +
				"\nThe engine capacity is "+ Engine.getCapacity() +"cc";
	}//toString
	
	public static class Engine extends Vehicle{
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;		
		
		public Engine(String model) {
			super(model);
		}//construtor
		
		public static String getMake() {
			return MAKE;
		}//getters
		public static int getCapacity() {
			return CAPACITY;
		}//getters		
		
	}//class Engine
	
	
}//class Vehicle
