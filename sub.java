import java.util.*; 
class sub
{  
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        String str1 = sc.nextLine();  
        System.out.println("Enter First Number: ");
        String str2 = sc.nextLine();   
        System.out.println(findSum(str1, str2));  

        int n1 = str1.length();
        int n2 = str2.length(); 
        String str="";
    	if (n1 < n2)
    	{
    		for (int i = 0; i < n1; i++) 
    		{ 
    			if (str1.charAt(i) < str2.charAt(i))
    			{
    				if(str2>str1)
    				{
    			        String t = str1; 
        				str1 = str2; 
        				str2 = t; 
    				}
    			str1 = new StringBuilder(str1).reverse().toString(); 
    			str2 = new StringBuilder(str2).reverse().toString(); 
      
  				  int carry = 0; 
  
   
    			for (int i = 0; i < n2; i++) 
    			{ 
 
        			int sub = ((int)(str1.charAt(i)-'0') -  
                    (int)(str2.charAt(i)-'0')-carry); 
          
  
        			if (sub < 0) 
        			{ 
            			sub = sub + 10; 
            			carry = 1; 
        			}		 
        			else
            		carry = 0; 
  
        			str += (char)(sub + '0'); 
    			} 
  
  
    			for (int i = n2; i < n1; i++) 
    			{ 
        			int sub = ((int)(str1.charAt(i) - '0') - carry); 
          

        			if (sub < 0) 
        			{ 
            			sub = sub + 10; 
            			carry = 1; 	
        			} 
        			else
            		carry = 0; 
              
        		str = str+(char)(sub + '0'); 
    			} 
  

    			return new StringBuilder(str).reverse().toString(); 
			} 
  

    		System.out.println(str); 
		 
		} 	
  	}
 }
    	
   	} 
        
 