import java.util.*;

class Numcheck
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	Integer num=s.nextInt();
	String str=num.toString();
	int len=str.length();
	char ch[]=str.toCharArray();
	int times=len/4;
	int finalans=len/4;
	System.out.println(times);
	char ch1[]=new char[str.length()];
	ch1[0]=ch[0];
	for(int i=0;i<len;i++)
	{
		int count=0;
		for(int j=0;j<len;j++)
		{
			if(ch[i]==ch[j])
			{
				count++;
				if(count>times)
					if(ch[i]>=ch1[0])
						{
						ch1[0]=ch[i];
						times=count;
						}
			}
		}
	}
	if(ch1[0]!=ch[0]||times!=finalans)
	{
	System.out.println(ch1[0]);
	}
	else
	{
	System.out.println(-1);
	}
	}
}				