package java.calculadora.dominio;

public class Operacao {

    public void soma(float x, float y) {
        float resultado = x + y;
        System.out.println("Resultado da soma: " + resultado);
    }

    public void sub(float x, float y) {
        float resultado = x - y;
        System.out.println("Resultado da subtração: " + resultado);
    }
}
