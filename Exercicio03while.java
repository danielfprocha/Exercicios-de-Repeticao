import java.util.Scanner;

public class Exercicio03while {
    //Crie um programa que solicite a senha para acesso ao sistema. A senha correta é 1234. O programa deve solicitar a senha até que o usuário forneça a senha correta. Quando a senha correta for informada, exiba a mensagem "Acesso concedido".
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = teclado.nextInt();

        int senhaCorreta = 1234;

        while (senha != senhaCorreta) {
            System.out.println("Senha incorreta! Tente novamente: ");
            senha = teclado.nextInt();
        }

        System.out.println("Acesso concedido");


        teclado.close();    

        }
    }