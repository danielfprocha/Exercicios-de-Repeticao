import java.util.Scanner;

public class Exercicio01while {
    //Crie um programa que utilize um loop while para imprimir, em linhas separadas, os números de 1 até 50.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i = 0;
        while (i < 50) {
            System.out.println((i + 1));
            i++;
        }


        teclado.close();    

        }
    }