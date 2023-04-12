//4.Preencha e Mostre uma Matriz de inteiro 2x2.
import java.util.Scanner;


public class tarefa04ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        //PREENCHENDO
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j < matriz[i].length; j++){
                System.out.print("Digite a posicao [" + i + "]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        //MOSTRANDO
        for(int[] aux: matriz){
            for(int aux_b : aux){
                System.out.println(aux_b);
            }
        }
        scanner.close();
    }
}
