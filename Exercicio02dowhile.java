import java.util.Scanner;

public class Exercicio02dowhile {
    // Desenvolva um programa que apresente ao usuário um menu com as seguintes opções: Adicionar, Remover e Sair. 
    // Use um loop do..while para permitir que o usuário escolha uma opção; Para as opções 1 e 2, exiba uma mensagem indicando que a ação foi executada (a implementação da funcionalidade pode ser simulada); Encerrar o loop somente quando a opção 3 (Sair) for escolhida.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Escolha uma opção: \n1. Adicionar \n2. Remover \n3. Sair");
            opcao = teclado.nextLine();
            switch (opcao) {
                case "Adicionar", "adicionar", "1": 
                System.out.println("Ação executada.");                  
                    break;
                case "Remover", "remover", "2":  
                System.out.println("Ação executada.");  
                    break;
                case "Sair", "sair", "3":
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("3") && !opcao.equalsIgnoreCase("sair"));
         System.out.println("Fim do programa.");

        teclado.close();
    }
}
