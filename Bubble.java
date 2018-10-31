import java.util.*;
class Bubble
{
public static void main(String args[])
{
int temp,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("unsorted array is");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
for(i=0;i<n;i++)
{
for(j=0;j<(n-i-1);j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println();
System.out.println("sorted array is");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Bubble.java
D:\JAVA PROGRAMS>java Bubble
enter the size of array
5
enter the elements of array
5
4
3
2
1
unsorted array is
5       4       3       2       1
sorted array is
1       2       3       4       5
