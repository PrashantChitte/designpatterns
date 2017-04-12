/**
 * 
 */
package singlton;

/**
 * @author Prashant
 *
 */
public class ThreadSafeDoublecheck {

	private static ThreadSafeDoublecheck instance;

	private ThreadSafeDoublecheck() {
		super();
	}

	public static ThreadSafeDoublecheck getInstance()
	{
		if(null==instance)
		{
			synchronized (ThreadSafeDoublecheck.class) {
				if(null==instance)
				{
					instance=new ThreadSafeDoublecheck();
				}
				
			}//End of synchronized
		}//outer if block
		return instance;		
	}
	
}
