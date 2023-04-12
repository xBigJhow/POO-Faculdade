//3.Crie um programa que  armazene 10 notas em um array e mostre a maior nota, a menor nota, e a média
import java.util.Scanner;

public class tarefa04ex03 {
    public static void main(String[] args) {
    //IMPORTO SCANNER
    Scanner scanner = new Scanner(System.in);
    //DECLARO VARIAVEL ARRAY PARA RECEBER AS NOTAS
    float[] notas = new float[10];

    //PREENCHO AS 10 NOTAS
    for(int i=0; i<notas.length;i++){
        System.out.print("Digite a " + (i+1) + "° nota: ");
        notas[i] = scanner.nextFloat();
    }
    //CRIO AS 3 VARIAVEIS PARA RECEBER OS VALORES, E O CONTADO RECEBE O TAMANHO DO ARRAY
    float media  = 0;
    float maior = 0; 
    float menor = 0; 
    float somador = 0;
    int contador = notas.length;
    //PERCORRO E ANALISO AS NOTAS
    for(int i=0; i<notas.length; i++){
        //SOMARA TODAS AS NOTAS
        somador += notas[i];

        //NA PRIMEIRA PERCORRIDA, MAIOR E MENOR RECEBEM O PRIMEIRO VALOR
        if(i == 0){
            maior = notas[0]; 
            menor = notas[0]; 
            // JA DEPOIS DA PRIMEIRA PERCORRIDA ANALISA SE O NUMERO PASSADO È MAIOR OU MENOR, E ATRIBUI
        } else{

            if(notas[i] > maior){
                maior = notas[i];
            }
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
    }  
    media = somador / contador;

    System.out.println("Maior nota: " + maior);
    System.out.println("Menor nota: " + menor);
    System.out.println("Media: " + media);

    scanner.close();


    }
}
