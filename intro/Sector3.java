class Sector
{
  static double area( )
	{
          int r=3;
	  double t=30.5;
	  double res=(0.5*r*r*t);
          return (res);
        }
   public static void main (String[] args)
   {
     System.out.println("--------MS---------");
     double x=area();
     System.out.println(x);
     System.out.print("--------ME---------");
   }
}