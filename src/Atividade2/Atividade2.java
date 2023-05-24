package Atividade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, med;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Confira sua média final\n");
		System.out.println("Digite sua primeira nota:");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite sua segunda nota:");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite sua terceira nota:");
		nota3 = leia.nextFloat();
		System.out.println("\nDigite sua quarta nota:");
		nota4 = leia.nextFloat();
		
		med = (nota1+nota2+nota3+nota4)/4;
		System.out.println("\nA sua média final é:\n" + med);
		
	}

}
