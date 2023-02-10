import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check PRIME Or NOT: ");
		int n=sc.nextInt();
		if(check(n)){
			System.out.print("Number is PRIME");
		}
		else{
			System.out.print("Number is NOT PRIME");
		}
	}
	static boolean check(int n){
		for(int i=2;i<n;i++){
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}