package com.exc20_7;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		System.out.println("Is 2 is equlas to 2 :"+isEqualTo(2, 2));
		System.out.println("Is 3 is equlas to 2 :"+isEqualTo(3, 2));
		System.out.println("Is 'C' is equlas to 'C' :"+isEqualTo('C', 'C'));
		System.out.println("Is 'D' is equlas to 'C' :"+isEqualTo('D', 'C'));
		System.out.println("Is 2.4 is equlas to 2.1 :"+isEqualTo(2.4, 2.1));
		System.out.println("Is 5.0 is equlas to 5.00 :"+isEqualTo(5.0, 5.00));
		System.out.println("Is \"abc\" is equlas to \"abc\" :"+isEqualTo("abc", "abc"));
		System.out.println("Is \"abc\" is equlas to \"cba\" :"+isEqualTo("abc", "cba"));
		Object ob1=new Object();
		Object ob2=new Object();
		System.out.println("Is object1 is equlas to object2 :"+isEqualTo(ob1, ob2));
	}
	 public static <T> boolean isEqualTo(T first, T second)
	 {
		 if(first.equals(second))
			 return true;
		 else
			 return false;
	 }
}
