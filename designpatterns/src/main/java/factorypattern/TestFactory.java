package factorypattern;

public class TestFactory {

	static String SPORTCAR="SportCar";
	static String TRUCK="Truck";
	static String BULLOCKCART="BullockCart";
	public static void main(String[] args) {
		
		
		AbstarctVehicle Lamborgini=VehicleFactory.getVehicle(SPORTCAR, "2", "4", "520km/h");
		AbstarctVehicle Bailagadi=VehicleFactory.getVehicle(BULLOCKCART, "2", "5+kids", "20km/h");
		AbstarctVehicle Truck=VehicleFactory.getVehicle(TRUCK, "10", "35+Ton", "80km/h");
	
		System.out.println("Factory Config. Lamborgini  :"+Lamborgini);
		System.out.println("Factory Config. Bailagadi   :"+Bailagadi);
		System.out.println("Factory Config. Truck       :"+Truck);
	
	}

}
