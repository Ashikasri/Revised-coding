package pack5;

public class InheritanceDemo {

	public static void main(String[] args) {
		Addsub obj = new Addsub();
		obj.num1=5;
		obj.num2=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		
		
	}

}
class Add
{
	int num1,num2,result;
	public void sum()
	{
		result=num1+num2;
	}
}
class Addsub extends Add
{
	int num1,num2,result;
	public void sum()
	{
	result = num1 + num2;	
	}
	public void sub()
	{
	result = num1 - num2;	
	}
}
