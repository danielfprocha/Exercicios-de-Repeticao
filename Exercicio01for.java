import java.util.Scanner;

public class Exercicio01for {
    // Crie um programa que imprima a tabela de multiplicação do número 5, de 1 até 10, utilizando um loop for.
    // Cada linha deve seguir o formato: "5 x [número] = [resultado]".
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.printf("A tabuada do 5 de 0 a 10 é: \n");

        for (int i = 0; i >= 1 && i <= 10; i++) 
        {
            int resultado = 5 * i;
            System.out.printf("5 * %d = %d \n", i, resultado);
        }

        teclado.close();
    }
}
