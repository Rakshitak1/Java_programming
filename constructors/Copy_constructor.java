
/*Whenever we pass object reference to the constructor the it is called as copy constructor*/

package constructors;

class copy
{
	int x; int y; String z;
	copy()
	{
		x=1000; y=2000; z="rak";
	}
	copy(copy ref)
	{
		x=ref.x;
		y=ref.y;
		z=ref.z;
	}
}
public class Copy_constructor {

	public static void main(String[] args) {
		
		copy c1 = new copy();
		copy c2 = new copy(c1);
		System.out.println(c1.x+" "+ c1.y+" "+c1.z);
		System.out.println(c2.x+" "+ c2.y+" "+c2.z);
	}
}
