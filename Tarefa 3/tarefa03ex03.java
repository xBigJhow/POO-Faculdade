// 3.Crie um programa que some 10 números digitados pelo usuário.
import java.util.Scanner;

public class tarefa03ex03 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int soma=0;
        for(int i=0; i<10; i++){
            System.out.print("Digite o " + (i+1) + "° número: " );
            soma += scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("O valor total dos dez números digitados é igual à " + soma);
        scanner.close();
        
        
    }
}