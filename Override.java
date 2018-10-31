class A
{
int i,j;
A(int p,int q)
{
i=p;
j=q;
}
void show()
{
System.out.println("i= "+i+" j= "+j);
}
}

class B extends A
{
int k;
B(int p,int q,int r)
{
super(p,q);
k=r;
}
void show()
{
System.out.println("i= "+i+" j= "+j+" k= "+k);
}
}

class Override
{
public static void main(String args[])
{
A a=new A(1,2);
B b=new B(7,8,9);
a.show();
b.show();
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Override.java
D:\JAVA PROGRAMS>java Override
i= 1 j= 2
i= 7 j= 8 k= 9




