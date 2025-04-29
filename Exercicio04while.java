import java.util.Scanner;

public class Exercicio04while {
    //Implemente um programa que imprima os 10 primeiros números da sequência de Fibonacci utilizando o loop while.
    //Inicie a sequência com os valores 0 e 1; Calcule os próximos termos somando os dois anteriores; Imprima cada número da sequência (em linha separada ou separados por vírgula).
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci: ");

        int i = 0, n1 = 0, n2 = 1;

        while (i < 10) {
            System.out.println(n1);
            int soma = n1 + n2;
            n1 = n2;
            n2 = soma;
            i++;
        }
        
        teclado.close();
    }
}
