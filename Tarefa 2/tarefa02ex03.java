// Crie um programa que receba 2 números e um operador (+, -. *, /) e faça a respectiva operação.
import java.util.Scanner;

public class tarefa02ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o operador: ");
        String operator = input.next();

        if(operator.equals("+") ) {
            System.out.println("O resultado é " + (num1 + num2));
        } else if(operator.equals("-")) {
            System.out.println("O resultado é " + (num1 - num2));
        } else if(operator.equals("*")) {
            System.out.println("O resultado é " + (num1 * num2));
        } else if(operator.equals("/")) {
            System.out.println("O resultado é " + (num1 / num2));
        } else {
            System.out.println("Operador Inválido.");
        }
        input.close();
    }
}
