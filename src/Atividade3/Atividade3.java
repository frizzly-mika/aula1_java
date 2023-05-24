package Atividade3;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		double sB = 2000.00, aN = 500.00, hE = 100.00, d = 200.00, sL;
		
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Veja seu holerite referente a este mês\n");
		System.out.println("Salário Bruto: " + sB);
		System.out.println("Adicional Noturno: " + aN);
		System.out.println("Horas Extras: " + hE);
		System.out.println("Descontos: " + d);
		
		sL = sB + aN + (hE*5) - d;
		
		System.out.println("\nSalário Líquido: " + sL);

	}

}
