import java.util.Scanner;

public class tarefa04ex05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] tabuada = new int[10][3];
        int valor = 0;
        System.out.print("Digite o valor desejado: ");
        valor = scanner.nextInt();

        System.out.println("TABUADA DO " + valor + " ABAIXO: ");
        for(int i=0; i < tabuada.length; i++){
            tabuada[i][0] = valor; // aqui recebe o valor
            tabuada[i][1] = i + 1; // aqui recebe o valor base
            tabuada[i][2] = (i+1) * valor; // aqui recebe a multiplicacao do valor + valor base;
        }
        for(int i=0; i< tabuada.length; i++){
            System.out.println(tabuada[i][0] + " X " + tabuada[i][1] + " = " + tabuada[i][2]);
        }

        scanner.close();

    }
}
