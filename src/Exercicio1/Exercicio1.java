package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entradaDoPeso = new Scanner(System.in);

        System.out.println("Digite o peso do peixe (em Kg): ");
        double pesoPeixe = entradaDoPeso.nextDouble();
        double limite = 50.0;
        double excesso = Math.max(pesoPeixe - limite, 0);
        double multa = excesso * 4.0;

        if (excesso > 0) {
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa a ser paga: R$" + multa);
        } else {
            System.out.println("Não houve excesso de peso. A multa não se aplica.");
        }
    }
}
