
/*If we have more than one constructor in a class is called as constructor overloading*/

package constructors;

class overloading
{
	overloading(int x)
	{
		System.out.println(x);
	}
	overloading(double z)
	{
		System.out.println(z);
	}
	overloading(int x, String y)
	{
		System.out.println(x+" "+y);
	}
}

public class Const_overloading {

	public static void main(String[] args) {
		overloading o1 = new overloading(100);
		overloading o2 = new overloading(100.222);
		overloading o3 = new overloading(100,"rak");
		
	}
}
