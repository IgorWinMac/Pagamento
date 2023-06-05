package entities;

public class Funcionario {

	public String nome;
	public String cargo;
	public double salario;

	public void status(String nome, String cargo, double salario){

		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Novo Salário: "+salario);
	}

	public void escolha(String nome, String cargo, double salario) {
		if (cargo.equals("gerente") && salario < 5000) {
			salario = salario + (salario * 0.015);
		}
		if(cargo.equals("vendedor") && salario < 1500){
			salario = salario + (salario * 0.02);
		}	
		status(nome, cargo, salario);
	}
}