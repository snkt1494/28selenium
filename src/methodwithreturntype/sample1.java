package methodwithreturntype;

public class sample1

{

	   public static void main(String[] args)
	   {
		      int num1= add(10,20);
		      System.out.println(num1);
		      
		      System.out.println("-----------------");
		      
		      System.out.println(add(5,6));
		      System.out.println("---------------------------");
		      
		      sample1 s1=new sample1();
		        
		       int num2=s1.mulvallu(9, 7);
		        System.out.println(num2);
		        System.out.println("----------------------------");
		        
		        System.out.println(s1.mulvallu(5, 5));
		        
		        System.out.println("------------------------------");
		        
		    String s5= sample2.ConvertNameToUpperCase ("vishal");
		         System.out.println(s5);
		         System.out.println("--------------------------------------");
		         
		         System.out.println(sample2.ConvertNameToUpperCase ("ramdas"));
		        
		        
		   
		
		      
		      
		
		   
	}
	   
	   public static int add(int a,int b)
	   {
		   int c=a+b;
			
	      return c;
	   }  
	   
	   public int mulvallu(int c, int d)
	   {
		   int mulvallu=c*d;
				   
			return mulvallu;	   
	   }
	   
}
