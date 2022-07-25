package br.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor : ");
        a = scan.nextInt();
        System.out.println("Digite o seundo valor : ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        float dividir = dividir(a, b);

        System.out.println("Os números escolhidos foram " + a + " e " + b);
        System.out.println("Somar é igual a  =  " + somar);
        System.out.println("Subtrair é igual a  =  " + subtrair);
        System.out.println("Multiplicar é igual a  =  " + multiplicar);
        System.out.println("Dividir é igual a  =  " + dividir);

    }
    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static float dividir(float a, float b){
        return a / b;
    }

    }

