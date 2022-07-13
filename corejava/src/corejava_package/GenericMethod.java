package corejava_package;
public class GenericMethod
{
	public <T> void methodgen(T var1)
	{
		System.out.println("The value passed is of the type "+var1.getClass().getSimpleName());
	}
	
	public static void main(String[]args)
	{
	GenericMethod ob=new GenericMethod();
	ob.<String>methodgen("is the best");
	ob.methodgen("Learning Java");
	ob.methodgen(154);
		
		// TODO Auto-generated method stub
	}
	}


