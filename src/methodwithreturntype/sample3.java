package methodwithreturntype;

public class sample3 
{
	
	public static void main(String[] args)
	{
		
	
    int num1= add(50,70);
    
     System.out.println(num1);
     System.out.println("----------------------------");
     System.out.println(add(8,9));
     System.out.println("---------------------------");
     
     sample3 s1=new sample3 ();
     int num2 = s1.mul(7,8);
     System.out.println(num2);
     
     System.out.println("-----------------------------");
       
     System.out.println(s1.mul(12,8));
     System.out.println("--------------------");
     
     String s4 =sample2.ConvertNameToUpperCase("sanket");
    		 System.out.println(s4);
     System.out.println("---------------------------");
       
     System.out.println(sample2.ConvertNameToUpperCase("abcd"));
  

	}
	
		




     public static int add(int a,int b)
     
     {
    	 int c= a+b;
    	 return c;
     }
     
     public int mul(int c,int d)
     {
    	 int mul=c*d;
    	 return mul;
     }
     
}