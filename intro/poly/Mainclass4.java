class Company
{
 void developer()
  {
    System.out.println("some noise,....");
  }
 }
 
 class C extends Company
 {
  void developer()
   {
    System.out.println("meow meow,....");
   }
 }

class Java extends Company
 {
  void developer()
   {
    System.out.println("bow bow,....");
  }
 }
class Python extends Company
 {
  void developer()
   {
    System.out.println("busss busss,....");
  }
 }
class Stimulator
{
 static void ansim(Company c1)
 {
 c1.developer();
 }
}
class Mainclass4
{
 public static void main(String[] args)
 {
  C c1=new C();
  Java j1=new Java();
  Python p1=new Python();
  Stimulator.ansim(c1);
  Stimulator.ansim(j1);
  Stimulator.ansim(p1);
  }
}

