// 2.Crie um programa que mostre se o número é par ou impar.  (numero%2 == 0) //par
import java.util.Scanner;

public class tarefa02ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if(numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        input.close();
    }
}
