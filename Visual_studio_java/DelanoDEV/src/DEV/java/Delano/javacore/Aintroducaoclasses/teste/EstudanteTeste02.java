package DEV.java.Delano.javacore.Aintroducaoclasses.teste;

import DEV.java.Delano.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        System.out.println("Referencia  da classe teste");
        estudante.nome = "Delano";
        estudante.idade = 35;
        estudante.sexo = 'M';
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println("--------------");

        System.out.println("Referencia da classe principal estudante");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
