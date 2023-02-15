class Circledemo1
{
  static void area()
  { 
    int r=3;
    final double pi=3.142;
    double res=pi*r*r;
    System.out.println(res);
   }
 }  
 class Circledemo2
 {
   public static void main(String[] args)
   {
     Circledemo1.area();
   }
 }