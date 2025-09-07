
import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {

        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para Soma, 2 para Subtração:");
        int escolha = sc.nextInt();

        Operacao op = new Operacao();

        switch (escolha) {
            case 1:
                op.soma(x, y);
                break;
            case 2:
                op.sub(x, y);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
