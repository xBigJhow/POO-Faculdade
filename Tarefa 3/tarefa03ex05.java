import java.util.Scanner;

public class tarefa03ex05 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int TheForbiddenOne = 0;
        System.out.print("Escolha um numero pra parar o loop: ");
        TheForbiddenOne = scanner.nextInt();
        while(numero != TheForbiddenOne){
            System.out.print(" Digite um número: ");
            numero = scanner.nextInt();
            scanner.nextLine();
            
        }
        System.out.print(" Voce digitou o número proibido!!!");
        scanner.close();
    }
}