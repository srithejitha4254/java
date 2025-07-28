import java.util.Scanner;
class binarysearch
{
public static void main(String args[]){
int n,i,num,low,high,middle;
int a[] = new int[20];
Scanner s = new Scanner(System.in);
System.out.println("Enter total number of elements:");
n = s.nextInt();
System.out.println("Enter elements in sorted order:");
for (i = 0; i< n; i++)
a[i] = s.nextInt();
System.out.println("Enter the search value:");
num = s.nextInt();
low = 0;
high = n-1;
middle = (low + high)/2;
while( high >= low )
{
if ( a[middle] < num ){
low = middle + 1;
}
else if ( a[middle] == num )
{
System.out.println("number found");
break;
}
else
{
high = middle - 1;
}
}
if ( low>high ){
System.out.println(" Number is not found");
}
}
}
