import java.util.Scanner;
class Addition
{
   public void add(int a,int b)
 {

   int sum = a+b;
   System.out.print("sum of two numbers is " + sum);
  }
   public void add(String a1,String a2)
 {
   String s = a1+a2;
   System.out.println("the concatenation of two string are " + s);
 }
}
class Main
{
   public static void main(String args[])

 {
   try
      {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the first number");
         int r=sc.nextInt();
         System.out.println("enter the second number");
         int m =sc.nextInt();
         System.out.println("enter the first string");
         String h=sc.next();
         System.out.println("enter the second string");
         String t =sc.next();
         Addition obj = new Addition();
         obj.add(r,m);
         obj.add(h,t);
      }
   catch(Exception e)

     {
         System.out.println("exception " + e);
     }

}
}


