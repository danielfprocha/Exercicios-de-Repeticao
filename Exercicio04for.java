public class Exercicio04for {
    // Desenvolva um programa que utilize um loop for para imprimir todos os números ímpares entre 1 e 100.
    // Cada número ímpar deve ser impresso em uma nova linha ou separados por vírgulas; Use lógica condicional (como o operador de módulo) para identificar os números ímpares.

    public static void main(String[] args) {
 
        System.out.println("Números ímpares no entre 1 e 100:");
            for (int i = 1;i >= 1 && i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }

    }
}
