package modelo;
/*/Modele um funcionário. Ele deve ter um identificador (int), identificador do setor (int), salario(int), RG (int)
 e um valor (boolean) que indique se o funcionário ainda está na empresa no momento ou se já foi mandado embora.
 Crie o método bonifica que aumenta o salário do funcionário de acordo com o parâmetro passado.
 Crie o método demite, que não recebe parâmetro algum, só modifica o valor boolean indicado que o funcionário não 
trabalha mais aqui.
 Crie uma classe Teste para testar e armazenar 5 funcionários.*/

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
