import mypack.*;
class AccountBalance
{
public static void main(String args[])
{
Balance B[]=new Balance[3];
B[0]=new Balance("john",3456);
B[1]=new Balance("jonny",6756);
B[2]=new Balance("jim",5645);
for(int i=0;i<3;i++)
{
B[i].show();
}
}
}

OUTPUT:
C:\Users\pranali>D:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>cd mypack
D:\JAVA PROGRAMS\mypack>javac Balance.java
C:\Users\pranali>D:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac AccountBalance.java
D:\JAVA PROGRAMS>java AccountBalance
john $3456.0
jonny $6756.0
jim $5645.0 