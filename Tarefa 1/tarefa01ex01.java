import java.util.Scanner;

public class tarefa01ex01{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //DECLARANDO
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o primeiro segundo: ");
        int num2 = scanner.nextInt();
        System.out.println("Voce digitou os numeros: " + num1 + " e " + num2);
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));

        scanner.close();
    }
}
