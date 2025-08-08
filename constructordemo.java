class A{
int l,b;
A(){
l=10;
b=30;
}
int area(){
return l*b;
}
}
class constructordemo{
public static void main(String[] args){
A s=new A();
int a=s.area();
System.out.println("The area is:"+a);
}
}