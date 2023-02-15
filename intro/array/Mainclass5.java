class Mainclass5
{
public static void main(String[] args)
	{
 double[] arr=new double [4];
 arr[0]=20.3;
 arr[1]=28.6;
 arr[2]=35.3;
 arr[3]=48.6;
 System.out.println("***********");
 System.out.println("*index \t values");
 System.out.println("***********");
 for (int i=0; i<arr.length; i++)
  {
   System.out.println(i+ "\t" + arr[i]);
  }
 }
}