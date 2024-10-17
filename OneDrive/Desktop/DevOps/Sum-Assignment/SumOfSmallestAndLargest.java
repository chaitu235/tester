import java.util.Scanner;
public class SumOfSmallestAndLargest {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd Number : ");
		int num3 = sc.nextInt();

		int min = Math.min(Math.min(num1,num2), num3);
		int max = Math.max(Math.max(num1,num2), num3);
		sum = min+max;
		
		System.out.println("Sum : "+sum);
		sc.close();
	}

}
