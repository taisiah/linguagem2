package visao;

import java.util.Scanner;

import modelo.Retangulo;

public class App {
	
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Digite a base do retângulo:");
		float base = input.nextFloat();
		System.out.println("Digite a altura do retângulo:");
		float altura = input.nextFloat();
		
	
		Retangulo r1 = new Retangulo(base,altura);
		System.out.println("A área do retângulo é "+ r1.areaRetangulo());
		
		
	}

}
