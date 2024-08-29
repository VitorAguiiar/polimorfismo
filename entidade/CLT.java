package entidade;

import entidade.enums.Cargo;

public class CLT extends Funcionario {

	
	private double convenio;
	public CLT(String nome , double salario, Cargo cargo, double convenio) {
		super(nome, salario, cargo);
		this.convenio = convenio;
		
	}
	public double getConvenio() {
		return convenio;
	}
	public void setConvenio(double convenio) {
		this.convenio = convenio;
	}
	public double receber() {
		return salario * 0.90 - convenio;
	}	
}
