/*Faça um projeto Java com as informações abaixo:

Na classe principal

Crie um loop para inserir 10 objetos Produto(id e descricao) em um ArrayList

Na sequencia, informe o indice de 2 registros e altere os mesmos

Posteriormente, Exclua mais 2 registros pelo índice

Liste todos os registros resultantes */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tarefa09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<Produto>();
        // INSERINDO OS PRODUTOS (OBJECT) NA ARRAYLIST
        for(int i=0; i<10; i++){
            Produto aux = new Produto();
            int aux_id;
            String aux_desc;
            System.out.println((i+1) + "° PRODUTO:");
            System.out.print("ID: ");
            aux_id = scanner.nextInt();
            scanner.nextLine(); // LIMPANDO BUFFER
            System.out.print("DESCRIÇÃO: ");
            aux_desc = scanner.nextLine();
            aux.setId(aux_id);
            aux.setDesc(aux_desc);

            produtos.add(aux);
        }
        //AGORA MUDANDO O VALOR DE 2 PRODUTOS
        int indice, id_alterado; // variaveis para auxiliar na alteracao
        String desc_alterado;
        Produto produto_alterado_1 = new Produto();
        Produto produto_alterado_2 = new Produto();


        //PRIMEIRO PRODUTO ALTERADO
        System.out.print("QUAL O INDICE DO PRIMEIRO PRODUTO A SER MUDADO: "); 
        indice = scanner.nextInt(); // perguntando o indicce
        System.out.print("ID NOVO: "); 
        id_alterado = scanner.nextInt(); // setando o novo id 
        scanner.nextLine(); // LIMPANDO BUFFER
        System.out.print("DESCRIÇÃO NOVA:");
        desc_alterado = scanner.nextLine(); // setando a nova descricao
        produto_alterado_1.setId(id_alterado); 
        produto_alterado_1.setDesc(desc_alterado);
        produtos.set(indice, produto_alterado_1); // agora alterando o objeto da array.
        
        
        //SEGUNDO PRODUTO ALTERADO
        System.out.print("QUAL O INDICE DO SEGUNDO PRODUTO A SER MUDADO: "); 
        indice = scanner.nextInt(); // perguntando o indicce
        System.out.print("ID NOVO: "); 
        id_alterado = scanner.nextInt(); // setando o novo id 
        System.out.print("DESCRIÇÃO NOVA:");
        scanner.nextLine(); // LIMPANDO BUFFER
        desc_alterado = scanner.nextLine(); // setando a nova descricao
        produto_alterado_2.setId(id_alterado); 
        produto_alterado_2.setDesc(desc_alterado);
        produtos.set(indice, produto_alterado_2); // agora alterando o objeto da array.
        
        
        int deletar_indice;
        //PRIMEIRO PRODUTO PARA DELETAR
        System.out.print("QUAL O INDICE DO PRIMEIRO PRODUTO A SER DELETADO: "); 
        deletar_indice = scanner.nextInt(); 
        produtos.remove(deletar_indice); // deletando o objeto pelo indice
        
        //SEGUNDO PRODUTO PARA DELETAR
        System.out.print("QUAL O INDICE DO SEGUNDO PRODUTO A SER DELETADO: "); 
        deletar_indice = scanner.nextInt(); 
        produtos.remove(deletar_indice); // deletando o objeto pelo indice
        
        for(Produto aux: produtos){
            System.out.println("ID: " + aux.getId() + "| DESCRICAO: " + aux.getDesc());
        }
        
        scanner.close();
    }
}
