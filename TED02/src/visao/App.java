package visao;

import java.util.Scanner;

import modelo.Retangulo;

public class App {
	
	public static void main (String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Digite a base do ret�ngulo:");
		float base = input.nextFloat();
		System.out.println("Digite a altura do ret�ngulo:");
		float altura = input.nextFloat();
		
	
		Retangulo r1 = new Retangulo(base,altura);
		System.out.println("A �rea do ret�ngulo � "+ r1.areaRetangulo());
		
		
	}

}
