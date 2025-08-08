class A{
int l,b;
A(int u,int v){
l=u;
b=v;
}
int area(){
return l*b;
}
}
class constructordemo2{
public static void main(String[] args){
A s=new A(80,100);
int a=s.area();
System.out.println("The area is:"+a);
}
}