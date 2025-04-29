import java.util.Scanner;


public class Exercicio04dowhile {
    // Desenvolva um programa que permita inserir várias notas (de 0 a 10) de alunos. Utilize um loop do..while para solicitar as notas;
    // Após cada inserção, pergunte se o usuário deseja continuar inserindo notas (por exemplo, "Deseja inserir outra nota? (s/n)"); Ao final, calcule e exiba a média das notas inseridas.

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        
        String resposta = "";
        double soma = 0;
        int contador = 1;
        double resultado = 0;

        System.out.println("Digite o resultado da prova (de 0 a 10): ");
        resultado = teclado.nextDouble();
        teclado.nextLine();

        soma += resultado;

        if (resultado < 0 || resultado > 10) {
            System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
            teclado.close(); 
            return;
        }

        do {
            System.out.println("Digite o resultado de mais uma prova (de 0 a 10): ");
        resultado = teclado.nextDouble();
        teclado.nextLine(); 

        if (resultado < 0 || resultado > 10) {
            System.out.println("A nota deve estar entre 0 e 10. Tente novamente.");
            continue; 
        }

        soma += resultado;
        contador++;

        System.out.println("Você deseja adicionar mais uma nota? (sim ou não): ");
        resposta = teclado.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        double media = soma / contador;

        if (contador > 0 && resultado >= 0 && resultado <= 10) {
            System.out.printf("As %d notas tiveram uma média de: %.2f \n", contador, media);
        }

        teclado.close(); 

    }
}
