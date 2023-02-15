class Sectrvrt
{
 double area()
 {
 int r=3;
 final double t=30.5;
 double c=0.5*r*r*t;
 return (c);
 }
   public static void main(String[] args)
 {
   Sectrvrt S1 = new Sectrvrt();
      double x= S1.area();
      System.out.println(x);
 }
}