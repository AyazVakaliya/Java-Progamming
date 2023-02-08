import java.util.Scanner;
public class AvarageOfFiveSubject{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 subject mark out of 100");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		float avrage=(a+b+c+d+e)/5;
		if(avrage<30){
			System.out.println("not pass\nand Avarage is "+ avrage);
		}
		else if(avrage<40){
			System.out.println("D garde\nand Avarage is "+ avrage);
		}
		else if(avrage<60){
			System.out.println("C grade\nand Avarage is "+ avrage);
		}
		else if(avrage<70){
			System.out.println("B grade\nand Avarage is "+ avrage);
		}
		else{
			System.out.println("A grade\nand Avarage is "+ avrage);
		}
	}
}