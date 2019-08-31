import java.util.Scanner;

public class Pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the length from the center to a vertex:");
		double r = sc.nextDouble();
		
		double s= 2*r*Math.sin(Math.PI/5);
		double Area = Math.round((5*s*s)/(4* Math.tan(Math.PI/5))*100)/100.0;
		System.out.println("The area of the Pentagon is "  + Area);
	}

}
