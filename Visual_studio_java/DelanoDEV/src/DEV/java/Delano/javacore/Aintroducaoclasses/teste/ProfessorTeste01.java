package DEV.java.Delano.javacore.Aintroducaoclasses.teste;

import DEV.java.Delano.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Delano";
        professor.idade = 35;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " " + "Idade: " + professor.idade + " " + "Sexo: " + professor.sexo);
    }
}
