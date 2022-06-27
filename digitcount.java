import java.util.*;
public class digitcount{
	public static long num(long n){
		if(n==0){
			return 0;
		}
		else
		{
			return 1+(num(n/10));
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = sc.nextLong();
		Long A=num(n);
		System.out.println("NO OF DIGITS ="+A);
	}
}