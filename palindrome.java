import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=a;
int reverse=0,remainder;
while(a>0)
{
remainder=a%10;
reverse=reverse*10+remainder;
a=a/10;
}
if(reverse==b)
System.out.println("is a palindrome number");
else
System.out.println("its not a palindrome number");
}
}