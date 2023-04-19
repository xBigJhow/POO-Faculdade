/* Crie uma classe Principal com um vetor de pessoas e adicione 10 pessoas com id, nome e salário no vetor. */

import java.util.Scanner;

public class tarefa05ex01 {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    int qtd;
    String nome;
    float salario;
    //pergunta quantas pessoas deseja inserir, para assim fazer o loop com a quantidade desejada.
    System.out.print("Quantas pessoas deseja inserir? -> ");
    qtd = scanner.nextInt();

    PessoaAula[] pessoas = new PessoaAula[qtd];


    for(int i=0; i<qtd; i++){


        pessoas[i] = new PessoaAula();

        System.out.println("=== INSERINDO DADOS DAS PESSOAS ===");
        pessoas[i].setID((i+1)); // o Id da pessoa recebe o numero da variavel i, automatico.

        scanner.nextLine(); //limpando buffer

        System.out.print("Digite o nome da " + (i+1) + "° pessoa: ");
        nome = scanner.nextLine();
        pessoas[i].setNome(nome); // lê um nome e insere na posicao i de cada classe "PessoaAula".
        //le o valor de um salario e insere na posicao i de cada classe PessoaAula
        System.out.print("Digite o salário da Pessoa: R$"); 
        salario = scanner.nextFloat();
        pessoas[i].setSalario(salario);

        scanner.nextLine(); //limpando buffer
    }

    for(int i=0; i<qtd; i++){
        System.out.println("DADOS DA " + (i+1) + "° PESSOA: "); // ID é o mesmo que a posição
        System.out.println("Nome: " + pessoas[i].getNome()); // Nome
        System.out.println("Salario: R$" + pessoas[i].getSalario()); // Salario

        
    }

    scanner.close();

    }
}
