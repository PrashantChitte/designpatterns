/**
 * 
 */
package singlton;

/**
 * @author PrashantChitte
 *
 */
public class EagarSinglton {

	static private EagarSinglton instance=new EagarSinglton();

	private EagarSinglton() {
		super();
	}
	
	public static EagarSinglton getInstance()
	{
		
		return instance;
		
	}
	
}
