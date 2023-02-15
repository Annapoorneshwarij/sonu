class Ellipvrt
{
 double area()
 {
 int a=3;
 int b=4;
 final double pi=3.142;
 double c=pi*a*b;
 return (c);
 }
   public static void main(String[] args)
 {
   Ellipvrt E1 = new Ellipvrt();
      double x= E1.area();
      System.out.println(x);
 }
}