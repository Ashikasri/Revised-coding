package pack6;
class Help
{
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public void add(int i,int j, int k)
	{
		System.out.println(i+j+k);
	}
	public void add(double i,double j)
	{
		System.out.println(i+j);
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Help obj=new Help();
		obj.add(5, 7);
		obj.add(3, 5,8);
		obj.add(4.5, 3.1);
	}

}
