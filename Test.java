//problem set 4
package touchup;

public class Test {
	
	public static void main(String[] Args) 
	{
	System.out.println(pal("ABA"));
    System.out.println(factorial(3));
    reverseDisplay(54);
    System.out.println(decimalToBinary(3));
		
	}
	
	//Problem 1
	public static boolean pal(String s)
	{
		if(s.length() == 1 || s.length() == 0)
			return true;
		else if(s.charAt(0) == s.charAt(s.length()-1))
			return pal(s.substring(1,s.length()-1));
		return false;
	}
	
	//Problem 2
	public static int factorial(int n) {
	return factorial(n,1);	
	}
	public static int factorial(int n, int count)
	{
		if(n != 0)
		{
		count*=n;
		return factorial(n-1,count);
		}
		return count;
	}
	
	//Problem 3
	public static void reverseDisplay(int n) //456 - 654
	{
		reverseDisplay(n,"");
	}
	
	public static void reverseDisplay(int n, String t)
	{
		String s = String.valueOf(n);
		if(s.length() != 1)
		{
		t+=s.charAt(s.length()-1);
		reverseDisplay(Integer.parseInt(s.substring(0,s.length()-1)),t);
		}
		else
		{
			t+=s;
		System.out.println(t);
		}
	}
	//Problem 4
	public static String decimalToBinary(int n)
	{
		if(n == 0)
			return String.valueOf(0);
		return decimalToBinary(n,"","");
	}

	public static String decimalToBinary(int n, String t,String reverset)
	{
		if(n != 0)
		{
			t = String.valueOf(n%2);
			reverset = t+reverset;
			return decimalToBinary(n/2,t,reverset);
		}
		else 
		return reverset;
	}
	//problem 5
	public E precedent(E data)
	{
		return E;
		
	}
	
	// problem 6
	
	/*
	 * 1)Sqrt(ln n)
	 * 2)n
	 * 3)n lg n
	 * 5)n^2
	 * 5)n^3
	 * 6)(3/2)^n
	 * 7)2^n
	 * 8)e^n
	 * 9)2^(2^n)
	 * 10)2^(2^(n+1))
	 * 11)n!
	 * 12)(n+1)!
	 */
	
	
	}
	

 

	
	
	
	
	


