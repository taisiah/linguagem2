/*
2. Faça um programa em Java, que resolva a equação de 2o grau.
O usuário ainda não deve digitar os valores, eles devem vir declarados no programa.

*/
import static java.lang.Math.sqrt;

public class Equacao2Grau {
	
	public static void main(String[] args) 
	{
		
		float a = 1;
		float b = 3;
		float c = 0;		
		float delta =  (b * b) - ((4 * a )* c);
		float raizDelta = (float)Math.sqrt(delta);
		float x1 = ((-1 * b) + raizDelta)/ (2 * a );
		System.out.println("O valor de x é :"+ x1);
		float x2 = ((-1 * b) - raizDelta)/ (2 * a );
		System.out.println("O valor de x é :"+ x2);
	}
	

}
