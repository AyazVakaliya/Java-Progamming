import java.util.Scanner;
public class MaxOfTwo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		int a=sc.nextInt();
		System.out.print("Enetr B: ");
		int b=sc.nextInt();
		FindMaxOfTwo(a,b);
	}
	static void FindMaxOfTwo(int a,int b){
		if(a>b){
			System.out.print("A is bigger");
		}
		if(b>a){
			System.out.print("B is bigger");
		}
		else{
			System.out.print("A and B is EQUAL");
		}
	}
}
//if(a=b){
		//	System.out.print("A and B is EQUAL")
	//	}