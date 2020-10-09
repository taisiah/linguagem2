package modelo;

import java.util.ArrayList;

public class Agencia {
	
	private ArrayList <Conta> listaContas;


	public Agencia (ArrayList<Conta>listaContas) {
		this.listaContas = listaContas ;
		
	}
	
	public Agencia() {
		listaContas = new ArrayList<Conta>();
	}
	
	public void setListaContas(ArrayList<Conta> listaContas) {
		this.listaContas = listaContas;
	}
	public ArrayList<Conta> getListaContas() {
		return listaContas;
	}
	
	public Conta maiorSaldo () {
		double maior = listaContas.get(0).getSaldo() ;
		Conta maiorConta = listaContas.get(0);
		for(int i=0 ;i<listaContas.size() ;i++) {
			if (listaContas.get(i).getSaldo() > maior ) {
				maior = listaContas.get(i).getSaldo();
				maiorConta = listaContas.get(i);
				
			}
				
		}
		return  maiorConta;
		
	}
	
	public void addNovaConta(Conta c) {
		listaContas.add(c);
	}
	
	public String toString () {
		return "lista de contas: "+ this.listaContas; 
		
	}
}