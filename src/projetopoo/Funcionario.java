package projetopoo;

public class Funcionario{
    private String nome;
    private int idade;
    private String sexo;
    
    public Funcionario(){
    
    }
  
    public Funcionario(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

