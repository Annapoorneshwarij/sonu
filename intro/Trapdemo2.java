class Trapdemo1
{
  static void area()
  { 
    int a=3;
    int b=8;
    int c=4;
    double res=(0.5)*(a+b*c);
    System.out.println(res);
   }
 }  
 class Trapdemo2
 {
   public static void main(String[] args)
   {
     Trapdemo1.area();
   }
 }