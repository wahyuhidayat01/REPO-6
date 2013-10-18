import java.util.*;

public class ExceptionTest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do{
		try{
			System.out.println("Enter First Num : ");
			int n1 = input.nextInt();
			System.out.println("Enter Second Num : ");
			int n2 = input.nextInt();
			int sum = n1/n2;
			System.out.println(sum);
			x=2;
		} catch (Exception e){
			System.out.println("You can do that");
		}
		} while (x ==1);
	}
}