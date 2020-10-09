package modelo;
/*Crie um projeto que utilize um ArrayList de objetos da classe Conta e determine o n�mero da conta de maior saldo. 
 Conta deve ter os atributos: numero (int) e saldo (double), al�m de seu construtores, gets, sets, toString.*/

public class Conta {
	private int numeroConta;
	private double saldo;
	

	public Conta (int numero,double saldo) {
		this.numeroConta = numero ;
		this.saldo = saldo;			
	}
	
	public Conta () {
		
	}
	
	public int getNumeorConta() {
		return this.numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public String toString () {
		return "n�mero da conta : "+ this.numeroConta + "  -  saldo : " + this.saldo ;
	}
	
}
