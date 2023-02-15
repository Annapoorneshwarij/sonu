class Sectorsam1
{
  static void area(int r)
  { 
    final double t=30.5;
    double res=0.5*r*t;
    System.out.println(res);
   }
 }  
 class Sectorsam2
 {
   public static void main(String[] args)
   {
     Sectorsam1.area(3);
   }
 }