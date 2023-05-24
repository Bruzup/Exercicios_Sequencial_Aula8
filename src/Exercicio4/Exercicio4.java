package Exercicio4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

       System.out.println("Digite quantos anos você tem em anos, meses e dias");

       System.out.println("Digite quantos anos: ");
       int anos = entradaDoUsuario.nextInt();

       System.out.println("Digite quantos meses: ");
       int meses = entradaDoUsuario.nextInt();

       System.out.println("Digite quantos dias: ");
       int dias = entradaDoUsuario.nextInt();

       int totalDias = (anos * 365) + (meses * 30) + (dias);

       System.out.println("Você tem um total de: " + totalDias + " dias de vida :) ");

    }
}
