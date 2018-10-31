import java.util.*;
class VectorDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Vector<Number> v=new Vector<Number>(4,2);
System.out.println("initial size: "+v.size());
System.out.println("initial capacity: "+v.capacity());
v.addElement(new Integer(1));
v.addElement(new Integer(2));
v.addElement(new Integer(3));
v.addElement(new Integer(4));
System.out.println("current capacity: "+v.capacity());
v.addElement(new Double(5.45));
v.addElement(new Integer(6));
System.out.println("capacity: "+v.capacity());
System.out.println("first element "+(Integer)v.firstElement());
System.out.println("last element "+(Integer)v.lastElement());
if(v.contains(new Double(5.45)))
System.out.println("vector contains 5.45");
else
System.out.println("vector does not contains 5.45");
Enumeration vEnum=v.elements();
System.out.println("elements of vector are ");
while(vEnum.hasMoreElements())
System.out.println(vEnum.nextElement()+" ");
System.out.println();
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac VectorDemo.java
D:\JAVA PROGRAMS>java VectorDemo
initial size: 0
initial capacity: 4
current capacity: 4
capacity: 6
first element 1
last element 6
vector contains 5.45
elements of vector are
1
2
3
4
5.45
6