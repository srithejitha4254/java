import java.util.scanner;
class Binarysearch
{
  public static void main(String args[])
  {
  int n,i,num,first,last,middle;
  int a[]=new int[10];
  Scanner s= new Scanner (System.in)
  System.out.println("Enter total number of element:");
  n=s.next int();
  System.out.println("Enter the sorted element :");
  for(i=0;i<n;i++)
   a[i]=s.nextInt();
  System.out.println("Enter the search element :");
   num=s.nextInt();
   first=0;
   last=n-1;
   middle=(first+last);
  while(first<=last)
 {
   if(a[middle]<num)
     first=middle+1;
      else if(a[middle]==num)
   {
    System.out.println(a[middle]+"number had found");
    break;
   }
   else
   {
    last=middle-1;
   }
    middle=(first+last)/2;
 }
    if(first>last)
      System.out.println("number is not found");
  }
}
