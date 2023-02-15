class Trapezoidmsample
{
  static void area(int a,int b,int h)
  { 
   double res=(0.5)*(a+b*h);
  System.out.println("the area of trapezoid is"+res);
  }
  public static void main (String[ ] args)
  {
  System.out.println("---------MS---------");
  area(3,8,2);
  System.out.println("---------ME---------");
  }
}