class Box
{
int ll,bb,hh;
Box()
{
ll=bb=hh=-1;
}
Box(int l)
{
ll=bb=hh=l;
}
Box(int l,int b,int h)
{
ll=l;
bb=b;
hh=h;
}
Box(Box ob)
{
ll=ob.ll;
bb=ob.bb;
hh=ob.hh;
}
double volume()
{
return (ll*bb*hh);
}
}

class Overloading
{
public static void main(String args[])
{
Box b1=new Box();
Box b2=new Box(10);
Box b3=new Box(10,20,30);
Box b4=new Box(b3);
double v1=b1.volume();
double v2=b2.volume();
double v3=b3.volume();
double v4=b4.volume();
System.out.println("default volume is "+v1);
System.out.println("volume of cube is "+v2);
System.out.println("volume of cuboid is "+v3);
System.out.println("volume is "+v4);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Overloading.java
D:\JAVA PROGRAMS>java Overloading
default volume is -1.0
volume of cube is 1000.0
volume of cuboid is 6000.0
volume is 6000.0
