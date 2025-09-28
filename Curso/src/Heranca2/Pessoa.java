package Heranca2;

public abstract class Pessoa {
    protected String Nome;
    protected int idade;
    protected String sexo;

    public void fazerAniversario(){
        this.idade++;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Dados [Nome=" + Nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    } 
    
}