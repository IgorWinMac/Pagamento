package entities;

public class Funcionario {

	public String nome;
	public String cargo;
	public double salario;

	public void escolha(String cargo, double salario) {
		if (cargo == "Gerente" || salario > 1500 && salario < 5000) {
			salario = salario + (salario * 0.015);
			System.out.println(salario);
		} else if (cargo == "Gerente" || salario > 5000) {
			System.out.println(salario);
		} else if(cargo == "Vendedor" || salario < 1500){
			salario = salario + (salario * 0.02);
			System.out.println(salario);
		}else if(cargo == "Vendedor" && salario > 1500){
			System.out.println(salario);
		}else{
			System.out.println(salario);
		}
	}

	public void status(String nome, String cargo, double salario){

		System.out.println("Nome: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.println("Novo Salário: "+salario);
	}
}
