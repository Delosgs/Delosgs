package DEV.java.Delano.javacore.Aintroducaoclasses.teste;

import DEV.java.Delano.javacore.Aintroducaoclasses.dominio.Carro;


public class Carroteste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Novo Onix";
        carro1.modelo = "Sedan plus";
        carro1.ano = 2019;

        carro2.nome = "Sandero";
        carro2.modelo = "Hath";
        carro2.ano = 2018;

        //carro1 = carro2;

        System.out.println("*Carro 1*");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n*Carro 2*"); // \n = pula para outra linha
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
