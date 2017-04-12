/**
 * 
 */
package singlton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Prashantchitte
 *
 */
public class ReflectionToBreakSingleton {

	public static void main(String[] args) {
		EagarSinglton eagar=EagarSinglton.getInstance();
		EagarSinglton eagarnew=null;
	
		Constructor[] construct=EagarSinglton.class.getDeclaredConstructors();
		for (Constructor constructor : construct) {
			constructor.setAccessible(true);
			try {
			
				eagarnew=(EagarSinglton) constructor.newInstance();

			} catch (Exception e) {
				e.printStackTrace();
			} 
			System.out.println("hashcode of first object   :"+eagar.hashCode());
			System.out.println("hashcode of second object   :"+eagarnew.hashCode());
		}
	}
	
	
}
