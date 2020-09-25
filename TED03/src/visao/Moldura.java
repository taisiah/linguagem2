package visao;

import java.util.Scanner;

import modelo.Retangulo;



public class Moldura {
	
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Digite a largura da moldura:");
		float b = input.nextFloat();
		System.out.println("Digite a altura da moldura:");
		float a = input.nextFloat();
		
		Retangulo r1 = new Retangulo(b,a);

		
		System.out.println("Digite a espessura da moldura:");
		float esp = input.nextFloat();
		float bmenor = b - (2 * esp);
		float amenor = a - (2 * esp);
		
		Retangulo r2 = new Retangulo(bmenor,amenor);
		
		System.out.println("A área da moldura é "+ (r1.areaRetangulo() - r2.areaRetangulo()));
		
		input.close();
	}

}

