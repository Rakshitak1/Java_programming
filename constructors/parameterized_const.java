
/*A constructor through which we can pass one or more parameters is called as 
  parameterized constructor.*/

package constructors;

class para
{
	para(int x, int y)
	{
		System.out.println(x+" "+y);
	}
}
public class parameterized_const {
	public static void main(String[] args) 
	{
		para a = new para(100,200);
	}
}
