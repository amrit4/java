import java.util.*; 
class add
{  
    public static void main(String[] args)  
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        String str1 = sc.nextLine();  
        System.out.println("Enter First Number: ");
        String str2 = sc.nextLine();   
        
        if (str1.length() > str2.length())
        {  
            String t = str1; 
            str1 = str2; 
            str2 = t; 
        } 

        String str = "";  

        int n1 = str1.length(); 
        int n2 = str2.length();  
  
    // rev
        str1=new StringBuilder(str1).reverse().toString(); 
        str2=new StringBuilder(str2).reverse().toString(); 
  
        int carry = 0;  
        for (int i = 0; i < n1; i++)  
        {  
         
            int sum = ((int)(str1.charAt(i) - '0') + (int)(str2.charAt(i) - '0') + carry);  
            str = str + (char)(sum % 10 + '0');  
  
        
            carry = sum / 10;  
        }  
  
     
        for (int i = n1; i < n2; i++)  
        {  
            int sum = ((int)(str2.charAt(i) - '0') + carry);  
            str += (char)(sum % 10 + '0');  
            carry = sum / 10;  
        }  
  
 
        if (carry > 0)  
            str = str + (char)(carry + '0');  
  

        str = new StringBuilder(str).reverse().toString();
        System.out.printl(str);             
    }  
}