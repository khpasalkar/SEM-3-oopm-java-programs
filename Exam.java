import java.util.*;
class Exam
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n,i,j;
int a[][]=new int[20][20];
System.out.println("enter the no. of rows n columns:");
m=sc.nextInt();
n=sc.nextInt();
for(i=0;i<m;i++)
{
System.out.println("enter marks:");
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
if(j==0)
a[i][n]=0;
a[i][n]+=a[i][j];
if(i==0)
a[m][j]=0;
a[m][j]+=a[i][j];
}
}
a[m][n]=0;
for(i=0;i<m;i++)
{
a[m][n]+=a[i][n];
}
for(i=0;i<=m;i++)
{
for(j=0;j<=n;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}

OUTPUT:
D:\KRUTIKA>javac Exam.java
D:\KRUTIKA>java Exam
enter the no. of rows n columns:
2
3
enter marks:
1
3
6
enter marks:
7
9
8
13610
79824
8121434