package Registra.funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String setor;
    
    public Funcionario(String nome, String cpf, String telefone, String endereco, String setor){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.setor = setor;
    }
    
    public abstract float calculoSalario();
    public abstract void aplicaAumento(float percentual);
    
    public void mostrar(){
        System.out.println("---------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Setor: " + setor);
    }
    
    public String getNome(){
        return nome;
    }
    

    
    
}

