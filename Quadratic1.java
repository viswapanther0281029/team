import java.util.*;
class Quadratic1
{
public static void main(String args[])
{
int a,b,D;
double r1,r2;
Scanner s1=new Scanner(System.in);
System.out.println("Enter a value");
a=s1.nextInt();
System.out.println("Enter b value");
b=s1.nextInt();
System.out.println("The given quadratic equation is ax^2+bx");
D=(b*b)-(4*a);
if(D>0)
{
System.out.println("the roots are real and unequal");
r1=(-b+Math.sqrt(D))/(2*a);
r2=(-b+Math.sqrt(D))/(2*a);
System.out.println("The first root is :"+r1);
System.out.println("The Second root is :"+r2);
}
if(D==0)
{
System.out.println("the roots are real and equal");
r1=(-b+Math.sqrt(D))/(2*a);
System.out.println("The first root is :"+r1);
System.out.println("The Second root is :"+r1);
}
if(D==0)
{
System.out.println("the roots are imaginary");
}
}
}





