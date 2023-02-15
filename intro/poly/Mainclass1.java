class Shap
{
 void area()
  {
    System.out.println("some area,....");
  }
 }
 
 class Circle extends Shap
 {
  void area()
   {
    System.out.println("area of circle....");
   }
 }

class Triangle extends Shap
 {
  void area()
   {
    System.out.println("area of triangle,....");
  }
 }
class Rectang extends Shap
 {
  void noise()
   {
    System.out.println("area of rectang,....");
  }
 }
class Stimulator
{
 static void ansim(Shap s1)
 {
 s1.area();
 }
}
class Mainclass1
{
 public static void main(String[] args)
 {
  Circle c1=new Circle();
  Triangle t1=new Triangle();
  Rectang r1=new Rectang();
  Stimulator.ansim(c1);
  Stimulator.ansim(t1);
  Stimulator.ansim(r1);
  }
}

