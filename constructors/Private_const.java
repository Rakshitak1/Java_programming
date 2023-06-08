
/*In java, it is possible to write a constructor as private, but according to the rule,
  we cannot access private members outside the class.*/

package constructors;

class Private_const
{
	int x; int y;
	private Private_const()
	{
		x=100; y=200;
	}
	public static void main(String[] args) {
		Private_const p = new Private_const();
		System.out.println(p.x+" "+p.y);
	}
}

