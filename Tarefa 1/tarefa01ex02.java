import java.util.Scanner;

public class tarefa01ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o primeiro segundo: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o primeiro terceiro: ");
        int num3 = scanner.nextInt();

        float media = (num1 + num2 + num3) / 3;

        System.out.println("A média dos três números é: " + media);
    }
}
