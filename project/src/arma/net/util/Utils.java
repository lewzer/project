package arma.net.util;

public class Utils
{
	public static String compileString (Object[] arr)
	{
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < arr.length; i++)
		{
			string.append(arr[i].toString());
			string.append("\n");
		}
		return string.toString();
	}
}
