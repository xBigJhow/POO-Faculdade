// 4.Crie um programa que mostre de 0 até o número digitado.
import java.util.Scanner;

public class tarefa03ex04 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int TheChosenOne = 0;
        System.out.print("Digite o valor desejado: ");
        TheChosenOne = scanner.nextInt();
        // Na estrutura "FOR"
        for(int i=0; i<=TheChosenOne; i++) {
            System.out.print(i + " ");
        }
        //PULANDO LINHA
        System.out.print("\n");
        //Estrutura "WHILE"
        int i=0;
        while(i <= TheChosenOne) {
            System.out.print(i + " ");
            i++;
        }
        scanner.close();
    }
}