/* Crie uma classe Pessoa com id, nome, salário encapsulados. */

public class PessoaAula {
    //Atributos
    private int id;

    private String nome;

    private float salario;


    //Setando os atributos
    public void setID(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }


    //Para fins de print.
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public float getSalario(){
        return this.salario;
    }
}
