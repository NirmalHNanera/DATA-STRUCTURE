import java.util.*;
class factorial
{
	
    public int factorial(int n)
    {
       
        {
        		return 1;
        }
        else 
        {
        	return( n*factorial(n-1));
        }
    }
}
		
       


public class FactorialRECUR
{
	public static void main(String[] args)
	{
		factorial fact = new factorial();
		int fac=fact.factorial(5);
		System.out.println("The factorial of number is"+fac);
	}
}