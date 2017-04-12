package factorypattern;

public class SportCar extends AbstarctVehicle{

	private String tyres;
	private String capacity;
	private String speed;
	
	
	public SportCar(String tyres, String capacity, String speed) {
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
		return "SportCar [tyres=" + tyres + ", capacity=" + capacity + ", speed=" + speed + "]";
	}

}
