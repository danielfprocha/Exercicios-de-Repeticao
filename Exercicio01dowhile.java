import java.util.Scanner;

public class Exercicio01dowhile {
    //Crie um programa que solicite ao usuário um número entre 1 e 100. Utilize um loop do..while para garantir que o valor informado esteja dentro do intervalo;
    //Exibir o número validado após a saída do loop.


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double i;

        do {
            System.out.println("Digite um número entre 1 e 100: ");
                i = teclado.nextDouble();
            if (i < 1 || i > 100) {
                System.out.println("Número inválido. Tente novamente.");
            } 
        } while (i < 1 || i > 100);
        System.out.println("Número digitado: " + i);
        
    

        teclado.close();

}
    }
