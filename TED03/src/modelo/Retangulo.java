package modelo;

public class Retangulo {

	private float base;
	private float altura;
	
	public Retangulo(float b, float a) {
		this.base = b;
		this.altura = a;
			
	}
	
	
	public Retangulo( ) {}
	
	
	
	public float getbase () {
		return this.base; 
	}	
	public float getAltura () {
		return this.altura;
	}
	public void setBase(float novabase) {
		this.base = novabase;
	}
	public void setAltura(float novaltura) {
		this.altura = novaltura;
	}
	
	public float areaRetangulo() {
		return  this.base * this.altura;
	}
}
