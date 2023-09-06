package br.com.jelicalculator.main;

import br.com.jelicalculator.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        List<Double> list = new ArrayList<>();

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM VINDO AO JELICALCULATOR!!");

        boolean exit = false;

        while (!exit) {
            System.out.println("""
                    QUAL OPERAÇÃO DESEJA REALIZAR ?
                    01 - Adição
                    02 - SUBTRAÇÃO
                    03 - DIVISÃO
                    04 - MULTIPLICAÇÃO
                    05 - MEDIA
                    06 - SAIR
                    """);
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("PRIMEIRA PARCELA: ");
                    double firstPortion = scanner.nextDouble();
                    System.out.println("SEGUNDA PARCELA: ");
                    double secondPortion = scanner.nextDouble();
                    calculator.sum(firstPortion, secondPortion);
                    System.out.println("TOTAL: " + calculator.getResult());
                }
                case 2 -> {
                    System.out.println("MINUENDO: ");
                    double minuend = scanner.nextDouble();
                    System.out.println("SUBTRAENDO: ");
                    double subtrahend = scanner.nextDouble();
                    calculator.subtraction(minuend, subtrahend);
                    System.out.println("RESTO: " + calculator.getResult());
                }
                case 3 -> {
                    System.out.println("DIVIDENDO: ");
                    double divided = scanner.nextDouble();
                    System.out.println("DIVISOR: ");
                    double divider = scanner.nextDouble();
                    calculator.division(divided, divider);
                    System.out.println("RESULTADO: " + calculator.getResult());
                }
                case 4 -> {
                    System.out.println("PRIMEIRO FATOR: ");
                    double stFactor = scanner.nextDouble();
                    System.out.println("SEGUNDO FATOR: ");
                    double ndFactor = scanner.nextDouble();
                    calculator.multiplication(stFactor, ndFactor);
                    System.out.println("PRODUTO: " + calculator.getResult());
                }
                case 5 -> {
                    boolean exitAverage = false;
                    while (!exitAverage) {
                        System.out.println("VALOR: ");
                        list.add(scanner.nextDouble());
                        System.out.println("PARAR -> s");
                        if (scanner.next().equals("s")) {
                            exitAverage = true;
                        }
                    }

                    calculator.average(list);
                }
                case 6 -> {
                    System.out.println("VOLTE SEMPRE!!");
                    exit = true;
                }
            }
        }
    }
}
