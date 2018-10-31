class Staff
{
int code;
Staff(int c)
{
code=c;
}
void showData()
{
System.out.println("code= "+code);
}
}

class Teacher extends Staff
{
String subject;
Teacher(int c,String s)
{
super(c);
subject=s;
}
void showData()
{
super.showData();
System.out.println("subject= "+subject);
}
}

class Typist extends Staff
{
double speed;
Typist(int c,double sp)
{
super(c);
speed=sp;
}
void showData()
{
super.showData();
System.out.println("speed= "+speed);
}
}

class Officer extends Staff
{
String grade;
Officer(int c,String g)
{
super(c);
grade=g;
}
void showData()
{
super.showData();
System.out.println("g= "+grade);
}
}

class Regular extends Typist
{
double salary; 
Regular(int c,double sp,double sal)
{
super(c,sp);
salary=sal;
}
void showData()
{
super.showData();
System.out.println("salary= "+salary);
} 
}

class Casual extends Typist
{
double dailywages; 
Casual(int c,double sp,double dw)
{
super(c,sp);
dailywages=dw;
}
void showData()
{
super.showData();
System.out.println("dailywages= "+dailywages);
} 
}

class Inheritance
{
public static void main(String args[])
{
Teacher t=new Teacher(12,"oopm");
Regular r=new Regular(16,34.67,50000);
Casual c=new Casual(34,57.86,2500);
Officer o=new Officer(18,"A grade");
t.showData();
System.out.println();
r.showData();
System.out.println();
c.showData();
System.out.println();
o.showData();
System.out.println();
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Inheritance.java
D:\JAVA PROGRAMS>java Inheritance
code= 12
subject= oopm

code= 16
speed= 34.67
salary= 50000.0

code= 34
speed= 57.86
dailywages= 2500.0

code= 18
g= A grade

