package Registra.funcionario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Atividade3Mod2 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos funcionários você deseja registrar?");
        int x = teclado.nextInt();
        List<Funcionario> funcionarios = new ArrayList<>();
        for ( int i = 0 ; i < x; i++){
            System.out.println("você quer registrar um funcionário assalariado ou horista?");
            String var = teclado.next();
            System.out.println("Digite o nome: ");
            String nome = teclado.next();
            System.out.println("Digite o CPF de " + nome + ": ");
            String cpf = teclado.next();
            System.out.println("Digite o número de telefone de " + nome + ": ");
            String telefone = teclado.next();
            System.out.println("Digite o endereço de " + nome + ": ");
            String endereco = teclado.next();
            System.out.println("Em que setor " + nome + " trabalha?");
            String setor = teclado.next();
            
            ///////////////////////////////////////////////////////////
            
            if (var.equals("assalariado")){
                System.out.println("Digite o salário de " + nome + ":");
                float salario = teclado.nextFloat();
                funcionarios.add(new funcionarioAssalariado(nome, cpf, endereco, telefone, setor, salario));
                
            }else if (var.equals("horista")){
                System.out.println("Quanto que " + nome + " ganha por hora trabalhada?");
                float salarioH = teclado.nextFloat();
                System.out.println("Quantas horas " + nome + " trabalha?");
                int horaT = teclado.nextInt();
                funcionarios.add(new funcionarioHorista(nome, cpf, endereco, telefone, setor, horaT, salarioH));
                
            }
        }
        System.out.println("///////////////////////////////////////////////////////////");
        System.out.println("Dados dos funcionários: ");
        for (int i = 0; i < x; i++) {
            funcionarios.get(i).mostrar();
            System.out.println("Pagamento: " + funcionarios.get(i).calculoSalario());
        }
        System.out.println("////////////////////////////////////////////////////////////");
        System.out.print("O quanto você deseja aumentar o salário dos funcionários?(em porcentagem):");
        float percentual = teclado.nextFloat();
        System.out.println("Aplicando aumento no salário dos funcionários: ");
        for (int i = 0; i < x; i++){
            funcionarios.get(i).aplicaAumento(percentual);
            System.out.println("pagamento de " + funcionarios.get(i).getNome() + " atualizado: " + funcionarios.get(i).calculoSalario());
            
            
        }
        
        
    } 
}
