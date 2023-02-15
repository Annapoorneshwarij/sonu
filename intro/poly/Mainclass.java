class Animal
{
 void noise()
  {
    System.out.println("some noise,....");
  }
 }
 
 class Cat extends Animal
 {
  void noise()
   {
    System.out.println("meow meow,....");
   }
 }

class Dog extends Animal
 {
  void noise()
   {
    System.out.println("bow bow,....");
  }
 }
class Snake extends Animal
 {
  void noise()
   {
    System.out.println("busss busss,....");
  }
 }
class Stimulator
{
 static void ansim(Animal a1)
 {
 a1.noise();
 }
}
class Mainclass
{
 public static void main(String[] args)
 {
  Cat c1=new Cat();
  Dog d1=new Dog();
  Snake s1=new Snake();
  Stimulator.ansim(c1);
  Stimulator.ansim(d1);
  Stimulator.ansim(s1);
  }
}

