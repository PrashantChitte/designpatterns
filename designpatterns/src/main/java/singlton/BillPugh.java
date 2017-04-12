/**
 * 
 */
package singlton;

/**
 * @author Prashant
 *
 */
public class BillPugh {

	private BillPugh() {
		super();
	}

	private static class BillPughInner
	{
		
		private static BillPugh INSTANCE=new BillPugh();
	}
	
	public static BillPugh getInstance()
	{
		return BillPughInner.INSTANCE;
		
	}
	
}
