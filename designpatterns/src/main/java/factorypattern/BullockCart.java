package factorypattern;

public class BullockCart extends AbstarctVehicle{

	
	@Override
	public String toString() {
		return "BullockCart [tyres=" + tyres + ", capacity=" + capacity + ", speed=" + speed + "]";
	}

	private String tyres;
	private String capacity;
	private String speed;
	
	
	public BullockCart(String tyres, String capacity, String speed) {
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

}
