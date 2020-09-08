/*

1. Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para 
o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
○ salário bruto.
○ quanto pagou ao IPRF
○ quanto pagou ao INSS.
○ quanto pagou ao sindicato.
○ o salário líquido.
○ o valor descontado.

*/
import java.util.Scanner;
public class MeuSalario {

	
	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Digite o valor da hora de trabalho:");
		float valorHora = input.nextFloat();
		System.out.println("Digite a quantidade de horas trabalhadas :");
		float qntdeHoras = input.nextFloat();
		
		
		float salarioBruto =  (valorHora * qntdeHoras);
		float iprf = 0.11f * salarioBruto;
		float inss= 0.08f * salarioBruto;
		float sindicato= 0.05f * salarioBruto;
		float descontos= sindicato + inss + iprf ;
		float salarioLiquido = salarioBruto - descontos ;
		
		
		System.out.println("O valor de IPRF é:" + iprf);
		System.out.println("O valor de INSS é:" + inss); 
		System.out.println("O valor do sindicato é:" + sindicato);
		System.out.println("O salário líquido é:" + salarioLiquido);
		System.out.println("O valor descontado é:" + descontos);
			
		
				
		
	}
	
	

}
