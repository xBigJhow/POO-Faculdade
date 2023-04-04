// 2.Crie um programa que mostre os números de 100  até 1

public class tarefa03ex02 {

    public static void main(String args[]){
        // Feito com a estrutura de repetição "FOR"
        for(int i=100; i>=1; i--) {
            System.out.print(i + " ");
        }
        //PULAR LINHA
        System.out.print("\n");
        // Feito com a estrutura de repetição "WHILE"
        int i=100;
        while(i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        
    }
}