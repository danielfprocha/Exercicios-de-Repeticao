public class Exercicio03for {
    public static void main(String[] args) {
        // Crie um programa que possua um vetor (array) de 10 números inteiros (você pode pré-definir os valores ou solicitar a entrada do usuário).
        // Utilize um loop for para percorrer o vetor; Calcule e exiba a soma total de todos os elementos do vetor.

        int vetor[] = new int[10];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[0] = 5;
            vetor[1] = 10;
            vetor[2] = 15;
            vetor[3] = 20;
            vetor[4] = 25;
            vetor[5] = 30;
            vetor[6] = 35;
            vetor[7] = 40;
            vetor[8] = 45;
            vetor[9] = 50;
            System.out.printf("Número %d: %d \n", i + 1, vetor[i]);
            soma = soma + vetor[i];
        }

    System.out.println("A soma dos valores do vetor é: " + soma);

    }
}
