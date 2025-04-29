import java.util.Scanner;
import java.util.Random;
// Crie um jogo onde o programa seleciona aleatoriamente um número entre 1 e 20 e o usuário deve adivinhá-lo. Utilize um loop do..while para repetir as tentativas;
// Para cada palpite, informe se o número digitado é maior ou menor que o valor sorteado; Ao acerto, exiba uma mensagem de congratulações junto com a quantidade de tentativas realizadas.


public class Exercicio03dowhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        String resposta;
        System.out.println("Vamos jogar! ");
        
        do {

            int numeroAleatorio = aleatorio.nextInt(1,21);
            int numeroTentativas = 0;
            int numeroUsuario = 0;
            int minimo = 1;
            int maximo = 20;
   
         do {

            if (minimo == maximo && numeroUsuario != numeroAleatorio) {
                System.out.printf("Que pena! Você perdeu! O número era %d. \n", numeroAleatorio);
                System.out.printf("Você teve %s tentativas. \n", numeroTentativas);
                break;
            }
           
            System.out.printf("Adivinhe o número entre %d e %d: \n", minimo, maximo);
            numeroUsuario = teclado.nextInt();
            teclado.nextLine(); 
            numeroTentativas++; 

            if (numeroUsuario < 1 || numeroUsuario > 20) {
                System.out.printf("O número está entre 1 e 20. Tente novamente.");
                continue;
            }

            if (numeroUsuario == numeroAleatorio) {
                System.out.printf("Parabéns! Você ganhou! O número secreto era %s. Você acertou em %s tentativas. \n" , numeroAleatorio, numeroTentativas);
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("O número é maior!");
                minimo = numeroUsuario + 1;
            } else {
                System.out.println("O número é menor!"); 
                maximo = numeroUsuario - 1;
            }

         } while (numeroUsuario != numeroAleatorio);

         System.out.println("Vamos jogar de novo? "); 
         resposta = teclado.nextLine(); 

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Obrigado por jogar!");
        teclado.close();
    }
}