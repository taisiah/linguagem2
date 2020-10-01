package visao;

import java.util.Scanner;
import modelo.Funcionario;


public class Main {
	
	public static void main (String[] args) {
		
		

		
		Funcionario[] listaFuncionarios = new Funcionario[5];
				
		Funcionario f1 = new Funcionario (1,12,2000,12345,true);
		
		listaFuncionarios[0] = f1;
		listaFuncionarios[1] = new Funcionario (2,12,2500,21212,true);
		listaFuncionarios[2] = new Funcionario (3,12,3000,31313,true);
		listaFuncionarios[3] = new Funcionario (4,12,2000,41414,true);
		listaFuncionarios[4] = new Funcionario (5,12,2000,51515,true);
	
		
		listaFuncionarios[0].bonificaFuncionario(0.5f);
		listaFuncionarios[3].demiteFuncionario();
		
	
		System.out.println("O salário atual do funcionario "+ listaFuncionarios[0].getCodFunc() +" é "+listaFuncionarios[0].getSalario());
		if (listaFuncionarios[1].getStatus() == false) {
			System.out.println("O status atual do funcionario "+ listaFuncionarios[1].getCodFunc() +" é demitido");
			
		}else {
			System.out.println("O status atual do funcionario "+ listaFuncionarios[1].getCodFunc() +" contratado");
			
		}
		
		
		
	}
}
