package pack8;

public class SingletonClass {

	public static void main(String[] args) {
		
		File obj1 =File.getInstance();

	}

}
class File
{
	static File obj = new File();
	private File()
	{
		
	}
	public static File getInstance()
	{
		return obj;
	}
}
