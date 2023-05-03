public interface ICadastro {
    void Inserir(Object obj);
    void Alterar(int indice, Object obj);
    void Excluir(int indice);
    Object[] Listar();
}