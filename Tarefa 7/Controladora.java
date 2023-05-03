public class Controladora {
    public static void gerenciar(ICadastro cadastro) {
        cadastro.Inserir("Objeto 1");
        cadastro.Inserir("Objeto 2");
        cadastro.Inserir("Objeto 3");
        cadastro.Alterar(1, "Objeto 4");
        cadastro.Excluir(2);
        Object[] objetos = cadastro.Listar();
        for (Object obj : objetos) {
            System.out.println(obj);
        }
    }
}