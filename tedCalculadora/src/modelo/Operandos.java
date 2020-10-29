
package modelo;

public class Operandos {
    private float operandoa;
    private float operandob;
    
    public Operandos(float numeroa,float numerob){
        this.operandoa = numeroa;
        this.operandob = numerob;     
    }
    
    public Operandos(){
        
    }
    
    public float soma(){
        return operandoa + operandob ;
    }
    
     public float subtrai(){
        return operandoa - operandob;
    }
     
     public float multiplica(){
        return operandoa * operandob;
    }
     
     public float divide(){
        return operandoa / operandob;
    }

    public float getOperandoa() {
        return operandoa;
    }

    public void setOperandoa(float operandoa) {
        this.operandoa = operandoa;
    }

    public float getOperandob() {
        return operandob;
    }

    public void setOperandob(float operandob) {
        this.operandob = operandob;
    }

    public String toString() {
        return "Operandos{" + "operandoa=" + operandoa + ", operandob=" + operandob + '}';
    }
     
   
         
     
     
}
