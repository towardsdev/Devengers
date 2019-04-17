package com.qa.sample;

public class printstarcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt =0;
		int limit=5;
		outerloop:
			for(int i = 1;i<=limit;)
			{
				for(int j = 1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
				if(i<limit && cnt == 0)
				{
					i=i+2;	
				}
				else
				{
					i=i-2;
					cnt=cnt+1;
					if(i==-1)
					{
						break outerloop;
					}
				}

			}

	}

}
