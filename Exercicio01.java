import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int minimo, maximo;
        String numero;

        System.out.println("Digite o valor mínimo: ");
        minimo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite o valor máximo: ");
        maximo = teclado.nextInt();
        teclado.nextLine();

        if (minimo > maximo) {
            System.out.println("O valor mínimo não pode ser maior que o valor máximo.");
        }

        System.out.println("Declare se você deseja um número par ou ímpar: ");
        numero = teclado.nextLine();
        

        if (numero.equalsIgnoreCase("par")) {
            System.out.println("Números pares no intervalo:");
            for (int i = minimo; i <= maximo; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (numero.equalsIgnoreCase("impar")) {
            System.out.println("Números ímpares no intervalo:");
            for (int i = minimo; i <= maximo; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Entrada inválida. Por favor, digite 'par' ou 'impar'.");
        }


        teclado.close();    

        }
    }
            
