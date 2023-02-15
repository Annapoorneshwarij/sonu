class Mainclass4
{
public static void main(String[] args)
	{
 byte[] arr=new byte [4];
 arr[0]=1;
 arr[1]=2;
 arr[2]=3;
 arr[3]=4;
 System.out.println("***********");
 System.out.println("*index \t values");
 System.out.println("***********");
 for (int i=0; i<arr.length; i++)
  {
   System.out.println(i+ "\t" + arr[i]);
  }
 }
}