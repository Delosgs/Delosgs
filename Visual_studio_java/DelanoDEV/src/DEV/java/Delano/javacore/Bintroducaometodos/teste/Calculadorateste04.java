package DEV.java.Delano.javacore.Bintroducaometodos.teste;

import DEV.java.Delano.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadorateste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println( "Dentro calculadorateste04 no teste");
        System.out.println("Num1 "+ a);
        System.out.println("num2 "+b);
    }
}
