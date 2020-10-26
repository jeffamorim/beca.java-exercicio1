package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Digite a quantidade de meses que deseja calcular: ");
		
		Scanner entrada = new Scanner(System.in);
		
		int meses = entrada.nextInt();
		
		int resultado = meses * 30;
		
		System.out.println("A quantidade de dias em " +meses+ " meses é de: "+resultado+ " dias");
	
		
	}
}