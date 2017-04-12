/**
 * 
 */
package singlton;

/**
 * @author PrashantChitte
 *
 */
public class StaticBlockSinglton {

	private static StaticBlockSinglton instance=null;

	private StaticBlockSinglton() {
		super();
	}
	
	static
	{
		try
		{
			instance=new StaticBlockSinglton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error while creating object in singlton class");
		}		
	}
	public static StaticBlockSinglton getInstance()
	{
		
		return instance;
		
	}
	
}
