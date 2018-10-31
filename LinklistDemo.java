import java.util.*;
class LinklistDemo
{
public static void main(String args[])
{
LinkedList<String> ll=new LinkedList<String>();
ll.add("c");
ll.add("d");
ll.add("e");
ll.add("f");
ll.addFirst("a");
ll.addLast("z");
ll.add(1,"b");
System.out.println("Original contents of linklist are "+ll);
ll.remove("d");
String val=ll.get(3);
ll.set(3,val+" changed");
System.out.println("linklist after change is "+ll);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac LinklistDemo.java
D:\JAVA PROGRAMS>java LinklistDemo
Original contents of linklist are [a, b, c, d, e, f, z]
linklist after change is [a, b, c, echanged, f, z]
