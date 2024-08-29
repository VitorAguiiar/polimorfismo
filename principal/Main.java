package principal;

import java.util.Scanner;

import entidade.CLT;
import entidade.Funcionario;
import entidade.Pj;
import entidade.enums.Cargo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		String nome = scn.next();
		
		System.out.println("Digite o salario: ");
		double salario = scn.nextDouble();
		
		System.out.println("Digite o valor adicional: ");
		double adicional = scn.nextDouble();
		
		Funcionario v = new Pj(nome, salario, Cargo.PROFESSOR, adicional);
		System.out.println(" nome: " + v.getNome() + " salario: " + v.getSalario() + " cargo: " + v.getCargo() + " receber: " + v.receber());
		
		
		
		System.out.println("Digite o nome: ");
		String nome2 = scn.next();
		
		System.out.println("Digite o salario: ");
		double salario2 = scn.nextDouble();
		
		System.out.println("Digite o valor do convenio: ");
		double convenio2 = scn.nextDouble();
		
		Funcionario z = new CLT(nome2, salario2, Cargo.DESENVOLVEDOR, convenio2);
		System.out.println("nome: " + z.getNome() + " salario: " + z.getSalario() + " cargo: " + z.getCargo() + " receber: " + z.receber());
		
		
	}	

}

