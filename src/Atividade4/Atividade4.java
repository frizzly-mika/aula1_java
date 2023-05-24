package Atividade4;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		float n01, n02, n03, n04, n1, n2, n3, n4, dif1, dif2;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada 1
		System.out.println("Vamos descobrir a diferença dos números dos grupos 1 e 2\n");
		System.out.println("Neste 1º grupo digite quatro números");
		System.out.println("Primeiro número: ");
		n01 = leia.nextFloat();
		System.out.println("Segundo número: ");
		n02 = leia.nextFloat();
		System.out.println("Terceiro número: ");
		n03 = leia.nextFloat();
		System.out.println("Quarto número: ");
		n04 = leia.nextFloat();
		
		//Entrada 2
		System.out.println("\n\nAgora, neste 2º grupo, digite mais quatro números");
		System.out.println("Primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Quarto número: ");
		n4 = leia.nextFloat();
		
		dif1 = (n01*n02) - (n03*n04);
		dif2 = (n1*n2) - (n3*n4);
		
		System.out.println("\n\nA diferença do 1º grupo é: " + dif1);
		System.out.println("\nE a diferença do 2º grupo é: " + dif2);
		
	}

}
