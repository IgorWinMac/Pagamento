package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite aqui o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe o seu cargo: ");
		String cargo = entrada.nextLine();
		
		System.out.println("Informe o seu salário: ");
		double salario = entrada.nextDouble();

		funcionario.escolha(cargo, salario);
		
		
		entrada.close();
	}

}
