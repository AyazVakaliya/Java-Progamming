import java.util.Scanner;
public class MaxOfThreeNumber{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of A");
		int a=s.nextInt();
		System.out.println("Enter Number of B");
		int b=s.nextInt();
		System.out.println("Enter Number of C");
		int c=s.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("A is Bigger");				
			}
			else{
				System.out.println("C is Bigger");
			}
		}
		else{
			if(b>c){
				System.out.println("B is Bigger");
			}
			else{
				System.out.println("C is Bigger");
			}
		}
	}
}