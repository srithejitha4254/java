class A
{
A()
{
System.out.println("Inside A's constructor");
}
}
class B extends A 
{
B()
{
System.out.println("Inside B's constructor");
}
}
class SingleDemo 
{
public static void main(String args[])
{
B b1=new B();
}
}
