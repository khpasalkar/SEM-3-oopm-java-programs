import java.util.*;
class VectorStudent
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str;
Vector v=new Vector();
int choice;
do
{
System.out.println("1:add\n2:remove\n3:display\n4:exit\nenter your choice");
choice=sc.nextInt();
switch(choice)
{
case 1:{
System.out.println("enter name");
str=sc.next();
v.addElement(str);
System.out.println("element inserted");
break;
}
case 2:{
System.out.println("enter name to remove");
str=sc.next();
v.removeElement(str);
System.out.println("element removed");
break;
}
case 3:{
Enumeration Enum=v.elements();
while(Enum.hasMoreElements())
System.out.println(Enum.nextElement());
break;
}
default:System.out.println("invalid choice");
break;
}
}while(choice!=4);
}
}