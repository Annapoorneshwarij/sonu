class College1
{
	String Coname;
	String Uniname;
	double Cost;
    College1(String X,String Y,double Z);
    
    {
      String Coname=X;
      String Uniname=Y;
      double Cost=Z;
    }
     public static void main(String[] args)
     {
       College1 C1=new College1("ABC","VTU",2500.32);

          System.out.println("Coname is"+C1.Coname);
          System.out.println("Uniname is"+C1.Uniname);
          System.out.println("Cost is"+C1.Cost);
    }
}
