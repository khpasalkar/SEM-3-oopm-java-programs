import java.util.*;
class Binary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the element to be searched");
int val=sc.nextInt();
int beg=0,end=n-1,mid;
while(beg<end)
{
mid=(beg+end)/2;
if(a[mid]==val)
{
System.out.println("element found at index "+mid);
break;
}
else if(a[mid]>val)
{
end=mid-1;
}
else
{
beg=mid+1;
}
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Binary.java
D:\JAVA PROGRAMS>java Binary
enter the size of array
5
enter the elements of array
2
3
4
5
6
enter the element to be searched
4
element found at index 2
