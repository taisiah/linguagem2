package visao;
import modelo.Conta;
import java.util.Scanner;
import java.util.ArrayList;
import modelo.Agencia;
public class Teste {

	public static void main (String[]Args) {
		
		
		Scanner input= new Scanner(System.in);
		
		
		Agencia agenciaModelo = new Agencia();
		
		System.out.println("Digite quantas contas tem a agência :");
		int qtd = input.nextInt();
		
		for (int i=0; i<qtd;i++) {
			System.out.println("Digite o número da conta :");	
			int numero = input.nextInt();
			System.out.println("Digite o saldo da conta :");
			double saldo = input.nextDouble();
			Conta c = new Conta(numero,saldo);
			agenciaModelo.addNovaConta(c);
		}
		
		
		
		System.out.println("A conta de maior saldo é : " + agenciaModelo.maiorSaldo() );	
		
		input.close();
		
	}
	
}
