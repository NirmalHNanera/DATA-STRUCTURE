import java.util.Scanner;
class Student_Detail{
	long enrollment_no;
	String name;
	int sem;
	double cpi;
	public Student_Detail(int enrollment_no,String name,int sem,double cpi){
		this.enrollment_no=enrollment_no;
		this.name=name;
		this.sem=sem;
		this.cpi=cpi;
	}
	public void printDetails(){
		System.out.println("Enrollment No. : "+enrollment_no);
		System.out.println("Name : "+name);
		System.out.println("Semester : "+sem);
		System.out.println("CPI : "+cpi);
	}
}
public class Student{
	public static void main(String[] args) {
		Student_Detail[] obj=new Student_Detail[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("enter student "+i+" details");
			System.out.print("Enter enroll no:");
			int enrollment_no =sc.nextInt();
			System.out.print("Enter name:");
			String name =sc.next();
			System.out.print("Enter Semester:");            int sem = sc.nextInt();
			System.out.print("enter CPI:");
			double cpi = sc.nextDouble();
			obj[i]=new Student_Detail(enrollment_no ,name,sem,cpi);
			
		}
			for(int i=0;i<5;i++){
			System.out.println("-----Details of student ----");
			obj[i].printDetails();
		}
	}
}