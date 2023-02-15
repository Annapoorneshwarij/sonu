class Circlesam1
{
  static void area(int r)
  { 
    final double pi=3.142;
    double res=pi*r*r;
    System.out.println(res);
   }
 }  
 class Circlesam2
 {
   public static void main(String[] args)
   {
     Circlesam1.area(3);
   }
 }