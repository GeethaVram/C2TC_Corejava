package corejava_package;
interface cube

	{
		int calculate(int a);
	}
	public class DunctionalInterface
	{
		public static void main(String args[])
		{
			int x =5;
			cube c =(int a)->a*a*a;
			int result=c.calculate(x);
			System.out.println(result);
		}
	}

		

	


