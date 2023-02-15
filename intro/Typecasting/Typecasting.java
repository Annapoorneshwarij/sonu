class Demo
{
  int a=10;
}

class Sample extends Demo
{
  void disp(){
  System.out.println("hii");
 }
}
 
class Typecasting
{
public static void main(String[] args)
{
 Demo d=(Demo)new Sample();
 System.out.println(d.a);
 
 // Downcasting
  Sample s=(Sample) d;
  s.disp();
  System.out.println(s.a);
 }
}
