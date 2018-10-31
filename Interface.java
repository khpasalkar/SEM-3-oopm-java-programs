import java.io.*;
interface Objects
{
double pi=3.14;
public void Area();
public void display();
}

class Rectangle implements Objects
{
double L1,B1,A1;
Rectangle(double l,double b)
{
L1=l;
B1=b;
}
public void Area()
{
A1=L1*B1;
}
public void display()
{
System.out.println("Area of rectangle is "+A1);
}
}

class Circle implements Objects
{
double radius,A2;
Circle(double r)
{
radius=r;
}
public void Area()
{
A2=pi*radius*radius;
}
public void display()
{
System.out.println("Area of circle is "+A2);
}
}

class Triangle implements Objects
{
double H1,B1,A3;
Triangle(double h,double b)
{
H1=h;
B1=b;
}
public void Area()
{
A3=0.5*H1*B1;
}
public void display()
{
System.out.println("Area of triangle is "+A3);
}
}

class Interface
{
public static void main(String args[])
{
Objects ref;
for(int i=1;i<=3;i++)
{
switch(i)
{
case 1:{  ref=new Rectangle(4,5);
              ref.Area();
              ref.display();
              break;
            }
case 2:{  ref=new Circle(5);
              ref.Area();
              ref.display();
              break;
            }
case 3:{  ref=new Triangle(4,5);
              ref.Area();
              ref.display();
              break;
            }
}
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Interface.java
D:\JAVA PROGRAMS>
D:\JAVA PROGRAMS>java Interface
Area of rectangle is 20.0
Area of circle is 78.5
Area of triangle is 10.0