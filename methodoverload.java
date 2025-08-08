class A{
int l=40,b=70;
int area(){
return l*b;
}
int area(int l,int b){
return l*b;
}
}
class methodoverload{
public static void main(String[] args){
A s=new A();
int r1=s.area();
int r2=s.area(50,50);
System.out.println("The area is:"+r1);
System.out.println("The area is:"+r2);
}
}