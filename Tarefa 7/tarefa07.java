public class tarefa07 {
    public static void main(String[] args) {
        ICadastro cadastro = new ICadastro() {
            private Object[] vetor = new Object[10];

            @Override
            public void Inserir(Object obj) {
                // Insere o objeto no próximo índice disponível
                for (int i = 0; i < vetor.length; i++) {
                    if (vetor[i] == null) {
                        vetor[i] = obj;
                        return;
                    }
                }
            }

            @Override
            public void Alterar(int indice, Object obj) {
                // Verifica se o índice é válido e altera o objeto
                if (indice >= 0 && indice < vetor.length) {
                    vetor[indice] = obj;
                }
            }

            @Override
            public void Excluir(int indice) {
                // Verifica se o índice é válido e remove o objeto
                if (indice >= 0 && indice < vetor.length) {
                    vetor[indice] = null;
                }
            }

            @Override
            public Object[] Listar() {
                // Retorna o vetor de objetos
                return vetor;
            }
        };

        Controladora.gerenciar(cadastro);
    }
}