
import java.util.Scanner;

public class Student_Grade_Calculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter no of subjects");
		int n5=sc.nextInt();
		int total=0;
		for(int i=0;i<n5;i++)
		{
			System.out.println("Enter marks obtaines in "+(i+1)+": ");
			int marks=sc.nextInt();
			total+=marks;
		}
		double averP=(double)total/n5;
		char Grade;
		if(averP>=90) {
			Grade='o';
		}
		else if(averP>=80) {
			Grade='A';
		}
		else if(averP>=60) {
			Grade='C';
		}
		else if(averP>=50) {
			Grade='D';
		}
		else if(averP>=40) {
			Grade='E';
		}
		else {
			Grade='F';
		}
		System.out.println("Total marks scored is "+total);
		System.out.println("Percentage gained is "+averP+"%");
		System.out.println("Grade :"+Grade);

	}

}	