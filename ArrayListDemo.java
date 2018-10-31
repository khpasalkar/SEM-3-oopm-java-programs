import java.util.*;
class ArrayListDemo
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
System.out.println("size of arraylist are "+al.size());
al.add("C");
al.add("D");
al.add("E");
al.add(1,"B");
System.out.println("original elements ot arraylist are "+al);
System.out.println("size of arraylist after addition of element are "+al.size());
al.remove("B");
System.out.println("changed arraylist is "+al);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac ArrayListDemo.java
D:\JAVA PROGRAMS>java ArrayListDemo
size of arraylist are 0
original elements ot arraylist are [C, B, D, E]
size of arraylist after addition of element are 4
changed arraylist is [C, D, E]


