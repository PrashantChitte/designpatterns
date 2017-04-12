/**
 * 
 */
package singlton;

/**
 * @author Prashant
 *
 */
public class ThreadSafeSinglton {

	private static ThreadSafeSinglton instance;

	private ThreadSafeSinglton() {
		super();
	}
	
	public static synchronized ThreadSafeSinglton getInstance()
	{
		if(null==instance)
		{
			instance=new ThreadSafeSinglton();
		}
		return instance;
		
	}
}
