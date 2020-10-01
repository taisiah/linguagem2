package modelo;
/*/Modele um funcion�rio. Ele deve ter um identificador (int), identificador do setor (int), salario(int), RG (int)
 e um valor (boolean) que indique se o funcion�rio ainda est� na empresa no momento ou se j� foi mandado embora.
 Crie o m�todo bonifica que aumenta o sal�rio do funcion�rio de acordo com o par�metro passado.
 Crie o m�todo demite, que n�o recebe par�metro algum, s� modifica o valor boolean indicado que o funcion�rio n�o 
trabalha mais aqui.
 Crie uma classe Teste para testar e armazenar 5 funcion�rios.*/

public class Funcionario {

	private int codFunc  ;
	private int codSetor ;
	private int salario ;
	private int rg ;
	private boolean status ;
	

	public Funcionario(int func,int setor, int sal, int rg, boolean status) {
		
		this.codFunc = func;
		this.codSetor = setor;
		this.salario = sal;
		this.rg = rg;
		this.status = status;
	}
		
	public Funcionario() {	
	}
	
	public int getCodFunc(){
		return this.codFunc;
	}
	
	public int getCodSetor(){
		return this.codSetor;
	}
	public int getSalario(){
		return this.salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
		
	}
	
	public int getRg(){
		return this.rg;
	}
	
	public boolean getStatus(){
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		
	}
	
	
	
	public  void  bonificaFuncionario (float bonus) {
		 this.salario += (bonus* this.salario);
	}
	
	public void demiteFuncionario () {
		 this.status = false;
	}
}
