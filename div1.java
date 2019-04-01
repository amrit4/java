import java.util.*;
class div
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        String str1 = sc.nextLine();  
        System.out.println("Enter First Number: ");
        String str1 = sc.nextLine(); 
        String ans = "";

        int idx = 0; 
		char []num = number.toCharArray(); 
		int temp = num[idx] - '0'; 

		while (temp < divisor) 
			temp = temp * 10 + (num[++idx] - '0'); 
		
		idx = idx+1; 
		
		while (num.length > idx) 
		{ 
		 
			ans += (temp / divisor) ; 
		
		
			temp = (temp % divisor) * 10 + num[idx++] - '0'; 
		} 
	
		 
		if (ans.length() == 0) 
			System.out.println("0"); 
	
		else  
			System.out.println(ans); 
	} 


} 
