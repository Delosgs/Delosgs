package DEV.java.Delano.javacore.Bintroducaometodos.dominio;

public class    Calculadora {
    public void somaDoisNumeros() {  // Void não retorna nenhum valor
        System.out.println(10 + 10);
    }

    public void subraiDoisNumeros() {  // Void não retorna nenhum valor
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {  // Void não retorna nenhum valor
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {  // Double retorna valor e por isso usa System.out.println
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros2(double num1, double num2) {  // Double retorna valor e por isso usa System.out.println
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; // É usado como um break mas, so no comando void. Poderia usar o else, mas, não fica legal.
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99; //Numero 1 e 2 são variaveis locais que estão dentro desse metodo alteraDoisNumeros
        numero2 =33;
        System.out.println("Dentro do alteraDoisNumeros do metodo principal");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);

    }
}
