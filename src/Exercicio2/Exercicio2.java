package Exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio2 {
    public  static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

       System.out.println("Digite a sua altura (Use a vírgula!): ");
       double altura = entradaDoUsuario.nextDouble();

      System.out.println("Digite o seu peso (Use a vírgula!): ");
      double peso = entradaDoUsuario.nextDouble();

        double valorImc = peso / (altura * altura);
      String AnalisePeso = ""; //trazendo a análise clínica

        if(valorImc <= 18.5 ) {AnalisePeso ="Magreza";}
        else if (valorImc >= 18.6 &&  valorImc <= 24.9) {AnalisePeso = "Está normal";}
        else if (valorImc >= 25 &&  valorImc<= 29.9) {AnalisePeso = "Está com sobrepeso, atenção!";}
        else if (valorImc >= 30 &&  valorImc<= 39.9) {AnalisePeso = "Está com obesidade, é recomendável procurar um nutricionista";}
        else if (valorImc >= 40) {AnalisePeso = "Obesidade Grave, é recomendável procurar um endocrinologista";}

        DecimalFormat formatador = new DecimalFormat("0.00");

   //System.out.printf("O valor do IMC é = %.2f %n ", valorImc) - uma forma também de diminuir as casas decimais
        System.out.println("O seu IMC é de " + formatador.format(valorImc) + " (" + AnalisePeso + ")" );
   }

}
