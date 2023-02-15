class Car
{
 void speed()
  {
    System.out.println("some noise,....");
  }
 }
 
 class Maruthi extends Car
 {
  void speed()
   {
    System.out.println("60km/h,....");
   }
 }

class Alto extends Car
 {
  void speed()
   {
    System.out.println("80km/h,....");
  }
 }
class Brezza extends Car
 {
  void speed()
   {
    System.out.println("100km/h,....");
  }
 }
class Stimulator
{
 static void ansim(Car c1)
 {
 c1.speed();
 }
}
class Mainclass2
{
 public static void main(String[] args)
 {
  Maruthi m1=new Maruthi();
  Alto a1=new Alto();
  Brezza b1=new Brezza();
  Stimulator.ansim(m1);
  Stimulator.ansim(a1);
  Stimulator.ansim(b1);
  }
}

