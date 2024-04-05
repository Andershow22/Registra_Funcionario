
package Registra.funcionario;


public class funcionarioAssalariado extends Funcionario {
    private float salario;
    
    public funcionarioAssalariado(String nome, String cpf, String telefone, String endereco, String setor, float salario){
        super(nome, cpf, telefone, endereco, setor);
        this.salario = salario;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Tipo: Assalariado");
        System.out.println("Salário: " + salario);
    }
    
    @Override
    public float calculoSalario(){
        return salario;
    }
    
    @Override
    public void aplicaAumento(float percentual){
        salario += salario * (percentual / 100);
    }
    
    
}
