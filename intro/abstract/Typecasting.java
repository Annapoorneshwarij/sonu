class Demo
{
 int a=10;
}
class Sample extends Demo
{
void disp()
{
System.out.println("ulti");
}
}
class TypeCasting
{
public static void main(String... a)
{
Demo d = new Sample();
System.out.println(d.a);
Sample s= (Sample) d;
s.disp();
System.out.println(s.a);
}
}



