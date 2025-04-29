import java.util.Scanner;

public class Exercicio02for {
    //Desenvolva um programa que leia um número inteiro positivo do usuário e calcule seu fatorial usando um loop for. Multiplique todos os números de 1 até o número informado; Exiba o resultado final do fatorial.
    public static int Fatorial(int n) {
        int fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número inteiro positivo: ");
    int n = teclado.nextInt();
        if (n < 0) {
            System.out.println("Número inválido. O número deve ser positivo.");
            teclado.close();
            return;
        }
    
        int resultado = Fatorial(n);
        System.out.printf("O fatorial de %d é: %d \n" , n, resultado);
    

    teclado.close();
    
}
}
