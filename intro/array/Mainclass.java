class Mainclass
{
public static void main(String[] args)
	{
 boolean[] arr=new boolean [4];
 arr[0]=true;
 arr[1]=false;
 arr[2]=true;
 arr[3]=true;
 System.out.println("***********");
 System.out.println("*index \t values");
 System.out.println("***********");
 for (int i=0; i<arr.length; i++)
  {
   System.out.println(i+ "\t" + arr[i]);
  }
 }
}