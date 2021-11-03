package DEV.java.Delano.javacore.Bintroducaometodos.teste;

import DEV.java.Delano.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadorateste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20); // Como void não retorna nenhum valor, não usa o System.out.println

    }
}
