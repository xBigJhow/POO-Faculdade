//2.Crie um programa que  armazene 10 notas em um array e os mostre em seguida
import java.util.Scanner;

public class tarefa04ex02 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    float[] notas = new float[10];

    for(int i=0; i<notas.length;i++){
        System.out.print("Digite a " + (i+1) + "° nota: ");
        notas[i] = scanner.nextFloat();
    }
    System.out.println("NOTAS ABAIXO:");
    for(float nota : notas){
        System.out.println(nota);
    }

    scanner.close();


    }
}
