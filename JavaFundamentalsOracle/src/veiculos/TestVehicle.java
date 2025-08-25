package veiculos;

import veiculos.Vehicle.Engine;

public class TestVehicle {

	public static void main(String[] args) {
					
		System.out.println("Manufacturer: "+ Vehicle.MAKE);		
		System.out.println("Number of vehicles manufactured: "+ Vehicle.numVehicles);		
		
		Vehicle vehicle_1 = new Vehicle("Ford");		
		//System.out.println(vehicle_1.toString());
		
		Vehicle vehicle_2 = new Vehicle("Edict");		
		//System.out.println(vehicle_2.toString());
		
		vehicle_2.setMAKE("Seer");
		System.out.println(vehicle_1.toString());
		System.out.println(vehicle_2.toString());
		
		Vehicle.Engine vehicle_3 = new Vehicle.Engine("Fortune");
		System.out.println("Vehicle number "+ vehicle_3.getChassisNo() +" is a "+ vehicle_3.getModel() +" model and has an engine capacity of "+
		vehicle_3.getCapacity() +"cc");
						
		System.out.println("Number of vehicles manufactured: "+ Vehicle.numVehicles);
		
		
	}//main

}//class
