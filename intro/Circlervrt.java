class Circlervrt
{
 double area()
 {
 int r=3;
 final double pi=3.142;
 double c=pi*r*r;
 return (c);
 }
   public static void main(String[] args)
 {
   Circlervrt C1 = new Circlervrt();
      double x= C1.area();
      System.out.println(x);
 }
}