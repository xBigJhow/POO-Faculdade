// 1.Crie um programa que  receba uma nota e partir desta nota ele apresente aprovado se nota maior que 5 e reprovado se nota menor que 5.
import java.util.Scanner;

public class tarefa02ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        float nota = scanner.nextFloat();

        if(nota >= 5) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }

        scanner.close();
    }
}
