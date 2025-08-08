class A{
int l,b;
A(){
l=10;
b=30;
}
A(int u,int v){
l=u;
b=v;
}
int area(){
return l*b;
}
}
class constructoroverload{
public static void main(String[] args){
A s=new A();
int a=s.area();
A s2=new A(12,24);
int a2=s2.area();
System.out.println("The area is:"+a);
System.out.println("The area is:"+a2);
}
}