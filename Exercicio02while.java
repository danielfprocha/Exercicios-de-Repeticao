import java.util.Scanner;

public class Exercicio02while {
    // Desenvolva um programa que solicite números ao usuário e some-os enquanto os números fornecidos forem positivos. Ao receber um número negativo, encerrar o loop e exibir o total acumulado dos números positivos.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");
        double i = teclado.nextDouble();
        double soma = 0;

        while (i >= 0) {
            soma += i;
            System.out.println("Digite um número: ");
            i = teclado.nextDouble();   
        }

        System.out.println("A soma dos números positivos digitados é: " + soma);
            

        teclado.close();
    }
}