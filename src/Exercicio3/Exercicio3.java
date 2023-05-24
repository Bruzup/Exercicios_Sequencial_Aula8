package Exercicio3;

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = entradaDoUsuario.nextDouble();
        double totalSalarioMin = Math.floor(salario / 1212);

        System.out.println(" O total de salários mínimos é: " + totalSalarioMin);
    }
}
