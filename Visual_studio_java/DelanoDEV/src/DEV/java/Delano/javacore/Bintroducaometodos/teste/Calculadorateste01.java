package DEV.java.Delano.javacore.Bintroducaometodos.teste;

import DEV.java.Delano.javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadorateste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(); // Como void não retorna nenhum valor, não usa o System.out.println
        System.out.println("Finalizando Calculadorateste01\n"); // \n pula a linha

        calculadora.subraiDoisNumeros(); // Como void não retorna nenhum valor, não usa o System.out.println
        System.out.println("Finalizando Calculadorateste02");
    }
}
