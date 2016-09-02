import java.io.*;
import java.util.*;
class test1
{
int studentid;
public test1(int studentid1)
{
this.studentid=studentid1;
}
public int getid()
{
return studentid;
}
}
class Test
{
public static void main(String args[])
{
test1 t=new test1(50);
System.out.println(t.studentid);
System.out.println(t.getid());
}
}