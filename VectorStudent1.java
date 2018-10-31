import java.util.*;
class VectorStudent1
{
public static void main(String args[])
{
String str;
Vector v=new Vector();
int n=args.length;
for(int i=0;i<n;i++)
{
v.addElement(args[i]);
}
Collections.sort(v);
Enumeration Enum=v.elements();
while(Enum.hasMoreElements())
System.out.println(Enum.nextElement());

}
}
