import java.io.*;
import java.util.*;
class Integrer
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int count=0 ;
for(int i=0;a!=0;i++)
{
a=a/10;
count++;
}
System.out.println(count);
}
}
