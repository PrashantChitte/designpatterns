/**
 * 
 */
package factorypattern;

/**
 * @author PrashantChitte
 *
 */
public class Truck extends AbstarctVehicle{

	private String tyres;
	private String capacity;
	private String speed;
	
	
	
	public Truck(String tyres, String capacity, String speed) {
		super();
		this.tyres = tyres;
		this.capacity = capacity;
		this.speed = speed;
	}

	@Override
	public String getTyres() {
		return this.tyres;
	}

	@Override
	public String getCapacity() {
		return this.capacity;
	}

	@Override
	public String getSpeed() {
		return this.speed;
	}

	@Override
	public String toString() {
		return "Truck [tyres=" + tyres + ", capacity=" + capacity + ", speed=" + speed + "]";
	}

}
