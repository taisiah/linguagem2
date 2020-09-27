package modelo;



public class Moldura {
	
	private Retangulo r1;
	private float espessura;
	private Retangulo r2;
	
	public Moldura (Retangulo r1 , float esp) {
		this.r1 = r1;
		this.setEspessura(esp);		
		this.r2 = new Retangulo(r1.getBase()-2*esp, r1.getAltura() - 2*esp);
	}
	
	public Moldura () {
	
	}

	public float areaMoldura() {
		return r1.areaRetangulo() - r2.areaRetangulo();
	}

	public float getEspessura() {
		return espessura;
	}

	public void setEspessura(float espessura) {
		this.espessura = espessura;
	}

}
