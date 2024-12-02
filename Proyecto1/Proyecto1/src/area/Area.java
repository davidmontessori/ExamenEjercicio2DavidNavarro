package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("indique el radio");
		
		double radio =input.nextInt();
		double area= Math.PI*radio*radio;
		
		System.out.println("el area es "+(area));
		
		
		
				
		input.close();
	}

}
