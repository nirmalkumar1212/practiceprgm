import java.io.*;
import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int flag=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("its a prime number");
else
System.out.println("its not a prime number"); 
}
}