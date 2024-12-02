package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("indique el lado");
		
		double lado =input.nextInt();
		double area= lado*lado;
		
		System.out.println("el area es "+(area));
		
		
		
				
		input.close();
	}

}
