import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float P, r, t, M;
        int C;
        String resposta = "";

        do {
            System.out.println("Digite o valor do invesrtimento inicial (P), em reais: ");
            P = teclado.nextFloat();

            System.out.println("Digite a taxa de juros anual (r): ");
            r = teclado.nextFloat();

            System.out.println("Digite o perído do investimento (t), em anos: ");
            t = teclado.nextFloat();

            System.out.println("A capitalização é simples ou composta? Digite 1 para simples e 2 para composta: ");
            C = teclado.nextInt();
            teclado.nextLine(); 

            if (C == 1) {
                M = P * (1 + r/100 * t);
                System.out.printf("O montante é de R$%.2f \n" , M);
            } else if (C == 2) {
                M = P * (float)Math.pow((1 + r/100), t);
                System.out.printf("O montante é de R$%.2f \n" , M);
            } else {
                System.out.println("Digite 1 para simples ou 2 para composta.");
            }

            System.out.println("Deseja fazer outro cálculo? Digite sim caso queira continuar ou não caso contrário: ");
            resposta = teclado.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));
        
            
        teclado.close();
    }
}
