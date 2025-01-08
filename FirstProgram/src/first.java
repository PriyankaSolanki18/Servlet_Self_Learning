import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter rollno: ");
		int rollno = input.nextInt();
		System.out.println("Roll no. : "+rollno);
		input.nextLine();
		
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.println("My name is "+name);
		
		System.out.print("Enter marks: ");
		float marks = input.nextFloat();
		System.out.println("Yor marks: "+marks);
	}
}
