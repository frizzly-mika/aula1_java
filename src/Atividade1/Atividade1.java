package Atividade1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = (salario + abono);
		
		System.out.println("\nO novo Salário é:\n" + novoSalario);
		

	}

}
