class A{
int l=40,b=70;
int area(){
return l*b;
}
}
class methoddemo3{
public static void main(String[] args){
A a1=new A();
int r=a1.area();
System.out.println("The area is:"+r);
}
}