//1.Crie um programa que  armazene 5 nomes no array e os mostre em seguida
import java.util.Scanner;

public class tarefa04ex01 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[5];

    for(int i=0; i<nomes.length;i++){
        System.out.print("Digite o " + (i+1) + "° nome: ");
        nomes[i] = scanner.nextLine();
    }
    System.out.println("NOMES ABAIXOS:");
    for(String nome : nomes){
        System.out.println(nome);
    }

    scanner.close();


    }
}
