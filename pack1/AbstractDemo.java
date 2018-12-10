package pack1;
//Abstract class and Abstract method
public class AbstractDemo {

	public static void main(String[] args) {
		Iphone obj = new Iphone();
		Samsung obj1 = new Samsung();
		show(obj1);

	}
	public static void show(phone obj)
	{
		obj.showconfig();
	}

}
abstract class phone
{
	public abstract void showconfig();
}
class Iphone extends phone
{
	public void showconfig()
	{
		System.out.println("2 Gb,IOS 9.3");
	}
	
}class Samsung extends phone
{
	public void showconfig()
	{
		System.out.println("2 Gb,S4");
	}
	
}