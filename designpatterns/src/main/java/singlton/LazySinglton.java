/**
 * 
 */
package singlton;

/**
 * @author PrashantChitte
 *
 */
public class LazySinglton {

	private static LazySinglton instance;
	
	private LazySinglton() {
		super();
	}

	public static LazySinglton getInstance()
	{
		if(null==instance)
		{
			instance=new LazySinglton();
		}		
		return instance;
		
	}
	
	
}
