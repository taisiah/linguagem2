package modelo;

public class Retangulo {
	
	private float base;
	private float altura;
	private float area;
	
	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
		this.area = this.base * this.altura;
		
	}
	
	public float areaRetangulo() {
		return area;
	}
	


}