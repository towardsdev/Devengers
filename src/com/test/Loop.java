package complex;

public class Loop 
{

	public static void main(String args[])
	{
		String i,j;
		try
		{
		for (i="*";i.length()<=4;i=i+"**")
		{
			System.out.println(i);
		}
				for(j="*****";j.length()>0;j=j.substring(0,j.length()-2))
		{
			System.out.println(j);	
		
		}
		}
		catch (Exception e)
		{
			
		}
	}
	
}
