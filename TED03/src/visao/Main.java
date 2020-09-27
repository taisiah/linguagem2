package visao;

import java.util.Scanner;

import modelo.Retangulo;
import modelo.Moldura;


public class Main {
	
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		

		
		System.out.println("Digite a largura da moldura:");
		float l = input.nextFloat();
		System.out.println("Digite a altura da moldura:");
		float a = input.nextFloat();
		System.out.println("Digite a espessura da moldura:");
		float esp = input.nextFloat();
		
		Retangulo r1 = new Retangulo(l,a);
		Moldura m1 = new Moldura (r1,esp);
		
		
		System.out.println("A área da moldura é: "+ m1.areaMoldura() );
		
		input.close();
	}

}

