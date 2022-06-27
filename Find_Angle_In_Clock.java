import java.util.Scanner;
public class Find_Angle_In_Clock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours : ");
		int hour = sc.nextInt();
		System.out.print("Enter minutes : ");
		int minit = sc.nextInt();

		if(hour==12)
			hour=0;
		if(minit==60)
			minit=0;

		int hourangle;
		int minitangle;

		hourangle= (hour * 30)  + (minit / 2);
		minitangle= (minit * 6);

		int angle;
		angle=Math.abs(hourangle-minitangle);

		System.out.println("Angle is : "+angle+" degree");
	}
}