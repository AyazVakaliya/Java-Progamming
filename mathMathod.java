public class mathMathod{
	public static void main(String[] args) {
		double n=-10,a=10,b=3,c=9,d=180;
		double e=Math.PI,y=Math.E;
		double f=9.6;
		
		double abs=Math.abs(n);
		double min=Math.min(a,b);
		double max=Math.max(a,b);
		double sqrt=Math.sqrt(c);
		double log=Math.log(y);
		double log10=Math.log10(a);
		double pow=Math.pow(a,b);
		double sin=Math.sin(Math.PI/2);
		double cos=Math.cos(Math.PI/2);
		double tan=Math.tan(Math.PI);
		double asin=Math.asin(0);
		double acos=Math.acos(0);
		double atan=Math.atan(0);
		double toRadians=Math.toRadians(d);
		double toDegrees=Math.toDegrees(e);
		double floor=Math.floor(f);
		double ceil=Math.ceil(f);
		double round=Math.toRadians(f);
		double g=Math.random();



		System.out.println("Absolute = "+abs);
		System.out.println("Smaller = "+min);
		System.out.println("Larger = "+max);
		System.out.println("Square = "+sqrt);
		System.out.println("Loge = "+log);
		System.out.println("log10 = "+log10);
		System.out.println("Power = "+pow);
		System.out.println("Sine = "+sin);
		System.out.println("Cosine = "+cos);
		System.out.println("Tangent = "+tan);
		System.out.println("ASine = "+asin);
		System.out.println("ACosine = "+acos);
		System.out.println("ATangent = "+atan);
		System.out.println("Degrees To Radians = "+toRadians);
		System.out.println("Radians To Degrees = "+toDegrees);
		System.out.println("Floor Integer OF F = "+floor);
		System.out.println("Ceil Integer Of F = "+ceil);
		System.out.println("Round Value OF F = "+round);
		System.out.println("Random Value Of F = "+g);
	}
}