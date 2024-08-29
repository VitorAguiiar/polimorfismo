package entidade;

import entidade.enums.Cargo;

public class Funcionario {

	private String nome;
	protected double salario;
	private Cargo cargo;
	
	

	@Override
	public String toString() {
		return "Funcionario nome = " + nome + ", salario = " + salario + ", cargo = " + cargo + "";
	}

	public double receber() {
		return salario * 0.90;
		
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Funcionario (String nome , double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		
	}
	
}
