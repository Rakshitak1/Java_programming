
/* CONSTRUCTOR
 * A constructor is a special type of method whose name is same as the class_name.
 * The main purpose of the constructor is to initialize the object.
 * Every java class has a constructor.
 * A constructor is automatically called at the time of object creation.
 * A constructor never contains any return type including void.*/

/*Default Constructor
 	A constructor which does not have any parameter is called as default constructor.
 */

package constructors;

class constt
{
	int a;
	double b;
	String c;
	constt()
	{
		 a=10; b=23.23; c="Rakshit"; 
	}
	void disp()
	{
		System.out.println(a+" "+b+" "+c);
	}
}
public class Constructor {
	
	public static void main(String[] args) {
		
		constt r = new constt();
		System.out.println(r.a+" "+r.b+" "+r.c);
		r.disp();
	}
}