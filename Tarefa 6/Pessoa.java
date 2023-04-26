public class Pessoa {
    //Variaveis privadas
    private int id;
    private String nome;
    private float salario;

    // Metodos para setar os valores
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //Metodos para visualizar os valores
    public void setSalario(float salario){
        this.salario = salario;
    }

    public int getID(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public float getSalario(){
        return this.salario;
    }

    // Sobrescrita de métodos
    @Override
    public String toString(){
        return "Id: " + getID() + " Nome: " + getNome() + " Salario: R$" + getSalario();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) 
            return true;
        if(obj == null) 
            return false;
        if (getClass() != obj.getClass()) 
            return false;
        Pessoa other = (Pessoa) obj;
        if(id != other.id)
            return false;  
        if(nome == null) { 
            if(other.nome != null)
                return false;
        } else if(!nome.equals(other.nome)) 
            return false;
        if(Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
            return false; 
        return true; 
    }

    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + Float.floatToIntBits(salario);
    return result;
}

}
