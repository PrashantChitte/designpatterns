package factorypattern;

public class VehicleFactory {

	
	public static AbstarctVehicle getVehicle(String type,String tyres, String capacity, String speed)
	{
		if("Truck".equalsIgnoreCase(type))
			return new Truck(tyres, capacity, speed);
		else if("SportCar".equalsIgnoreCase(type))
			return new SportCar(tyres, capacity, speed);
		else if("BullockCart".equalsIgnoreCase(type))
			return new BullockCart(tyres, capacity, speed);
		
		return null;
		
	}
}
