package DEV.java.Delano.javacore.Bintroducaometodos.teste;

import DEV.java.Delano.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadorateste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 0));
        System.out.println("-------------");
        calculadora.imprimeDivideDoisNumeros(86, 2); // Como void não retorna nenhum valor, não usa o System.out.println
    }
}

