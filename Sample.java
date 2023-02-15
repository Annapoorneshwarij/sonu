class Sample
{
	int sid;
	String sname;
	char ssec;
   Sample(int a, String b, char c);
 {
   sid=a;
   sname=b;
   ssec=c;
 }
  public static void main(String[] args)
  {
  Sample s1=new Sample(10,"hii",'A');

  System.out.println("sid is"+s1.sid);
  System.out.println("sname is"+s1.sname);
  System.out.println("ssec is"+s1.ssec);
  }
}