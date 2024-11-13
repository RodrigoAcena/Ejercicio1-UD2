package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Numero 1: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Numero 2: ");
		int num2 = entrada.nextInt();
		entrada.close();
		
		int suma = num1 + num2;
		
		System.out.print(num1+" + "+num2+" es igual a "+suma);

	}

}
