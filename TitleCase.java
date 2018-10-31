import java.util.*;
class TitleCase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str,str1,str2;
int i;
System.out.println("enter a string:");
str=sc.nextLine();
str=str.toLowerCase();
str1=str.substring(1);
str=str.substring(0,1);
str=str.toUpperCase();
str=str.concat(str1);
int n=str.length();
for(i=0;i<n;i++)
{
if(str.charAt(i)==' ')
{
str1=str.substring(0,i+1);
str2=str.substring(i+2);
str=str.substring(i+1,i+2);
str=str.toUpperCase();
str=str1.concat(str);
str=str.concat(str2);
}
}
System.out.println("string in title case is "+str);
}
}