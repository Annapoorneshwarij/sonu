interface Demo
{
  void disp();
  void cool();
}
abstract class Sample implements Demo
{
 public void disp()
 {
  System.out.println("oddered ooo offered");
  }
}
class Tester extends Sample
{
 public void cool()
  {
    System.out.println("hii");
  }
}
class MainClass2
{
	public static void main(String...a)
{
  Tester t=new Tester();
  t.disp();
  t.cool();
}
}
