package br.com.jelicalculator.calculator;

import java.util.List;


public class Calculator {
    private double result;

    public double getResult() {
        return this.result;
    }

    public void sum (double x, double y) {
        this.result = x + y;
    }

    public void subtraction (double x, double y) {
        this.result = x - y;
    }

    public void multiplication (double x, double y) {
        this.result = x * y;
    }

    public void division (double x, double y) {
        this.result = x / y;
    }

    public void average (List<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
           total += list.get(i);
        }
        double rate = total / list.size();
        System.out.println("MEDIA: %.2f".formatted(rate));
    }

}
