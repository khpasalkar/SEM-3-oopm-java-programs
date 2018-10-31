import java.util.*;
class InBuiltException
{
public static void main(String args[])
{
try
{
int a=args.length;
System.out.println("a="+a);
int b=10;
int d=b/a;
}
catch(ArithmeticException e)
{
System.out.println("divide by zero: "+e);
}
try
{
int a[]={1,2,4};
a[30]=45;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index oob: "+e);
}
try
{
String s="hello";
char c=s.charAt(20);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("String index oob: "+e);
}
} 
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac InBuiltException.java
D:\JAVA PROGRAMS>java InBuiltException
a=0
divide by zero: java.lang.ArithmeticException: / by zero
Array index oob: java.lang.ArrayIndexOutOfBoundsException: 30
String index oob: java.lang.StringIndexOutOfBoundsException: String index ou
 range: 20










							