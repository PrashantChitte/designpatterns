package singlton;

import java.io.Serializable;

public class BreakSingltonTest implements Serializable{

	public static void main(String[] args) {

		
		EagarSinglton e1=EagarSinglton.getInstance();
		EagarSinglton e2=EagarSinglton.getInstance();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		//EagarSinglton xx;
				
	}

}
class tempo extends BreakSingltonTest
{
	EagarSinglton z=EagarSinglton.getInstance();
	
	
}