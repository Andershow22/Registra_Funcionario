package Registra.funcionario;

public class funcionarioHorista extends Funcionario {
    private int horas_trabalhadas;
    private float sal_hora;
    
    public funcionarioHorista(String nome, String cpf, String telefone, String endereco, String setor, int horas_trabalhadas , float sal_hora ){
        super(nome, cpf, telefone, endereco, setor);
        this.horas_trabalhadas = horas_trabalhadas;
        this.sal_hora = sal_hora;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Salário por hora: " + sal_hora);
        System.out.println("Horas trabalhadas: " + getHoras_trabalhadas());
        
    }
    
    @Override
    public float calculoSalario(){
        return horas_trabalhadas * sal_hora;
        
    }    
    
    public void aplicaAumento(float percentual){
        sal_hora += sal_hora * (percentual / 100);
    }

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    
    
    
}

