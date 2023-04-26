import java.util.Scanner;

public class tarefa06ex01{
    public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    Pessoa pessoa[] = new Pessoa[10];

    System.out.println("--- Inserindo Pessoas --- ");
    
    for(int i=0; i< pessoa.length; i++){
        Pessoa aux = new Pessoa();
        System.out.println((i+1) + "° Pessoa: ");
        System.out.print("ID:");
        aux.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nome: ");
        aux.setNome(scanner.nextLine());
        System.out.print("Salário: R$");
        aux.setSalario(scanner.nextFloat());
        pessoa[i] = aux;
        System.out.println("==== INSERIDO COM SUCESSO ====");
    }

    scanner.close();

    }
}