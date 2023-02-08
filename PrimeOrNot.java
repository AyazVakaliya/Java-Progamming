import java.util.Scanner;
public class PrimeOrNot{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER TO FIND NUMBER IS PRIME OR NOT");
		int a=s.nextInt();
		boolean p=true;
		for (int i=2;i<=a/2;i++){
			if(a%i==0){
				p=false;
				break;
			}
		}
		if(p){
			System.out.println("PRIME");
		}
		else{
			System.out.println("NOT PRIME");
		}
	}
}