package testpatterns;

import singlton.BillPugh;
import singlton.EagarSinglton;
import singlton.LazySinglton;
import singlton.StaticBlockSinglton;
import singlton.ThreadSafeDoublecheck;
import singlton.ThreadSafeSinglton;

public class TestAllPatterns {

	public static void main(String[] args) {
			
		System.out.println("************Run Pattern*************");
		EagarSinglton egarfirst=EagarSinglton.getInstance();
		EagarSinglton egarSecond=EagarSinglton.getInstance();
		System.out.println("Hashcode EgarfirstObject  :"+egarfirst.hashCode());
		System.out.println("Hashcode EgarSecondObject :"+egarSecond.hashCode());
		System.out.println("--------------------------------------------------------");
		
		StaticBlockSinglton objectone=StaticBlockSinglton.getInstance(); 
		StaticBlockSinglton objecttwo=StaticBlockSinglton.getInstance();
		System.out.println("Hashcode StaticBlockSinglton objectone :"+objectone.hashCode());
		System.out.println("Hashcode StaticBlockSinglton objecttwo :"+objecttwo.hashCode());
		System.out.println("--------------------------------------------------------");
		
		LazySinglton lazyObjectfirst=LazySinglton.getInstance();
		LazySinglton lazyObjectSecond=LazySinglton.getInstance();
		System.out.println("Hashcode LazySinglton lazyObjectfirst  :"+lazyObjectfirst.hashCode());
		System.out.println("Hashcode LazySinglton lazyObjectSecond :"+lazyObjectSecond.hashCode());
		System.out.println("--------------------------------------------------------");
		
		ThreadSafeSinglton threadSafeFirst=ThreadSafeSinglton.getInstance();
		ThreadSafeSinglton threadSafeSecond=ThreadSafeSinglton.getInstance();
		System.out.println("Hashcode ThreadSafeSinglton threadSafeFirst   :"+threadSafeFirst.hashCode());
		System.out.println("Hashcode ThreadSafeSinglton threadSafeSecond  :"+threadSafeSecond.hashCode());
		System.out.println("--------------------------------------------------------");
		
		ThreadSafeDoublecheck threadsafedoublecheckobject1=ThreadSafeDoublecheck.getInstance();
		ThreadSafeDoublecheck threadsafedoublecheckobject2=ThreadSafeDoublecheck.getInstance();
		System.out.println("Hashcode ThreadSafeDoublecheck object 1  :"+threadsafedoublecheckobject1.hashCode());
		System.out.println("Hashcode ThreadSafeDoublecheck object 2  :"+threadsafedoublecheckobject2.hashCode());
		System.out.println("--------------------------------------------------------");
		
		BillPugh BPfirstObject=BillPugh.getInstance();
		BillPugh BPSecondObject=BillPugh.getInstance();
		System.out.println("Hashcode BillPugh object 1 :"+BPfirstObject.hashCode());
		System.out.println("Hashcode BillPugh object 2 :"+BPSecondObject.hashCode());
	}
	

}
