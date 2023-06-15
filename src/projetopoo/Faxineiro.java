package projetopoo;

public class Faxineiro extends Funcionario{
    
    private String setor;
    private double salario;

    public Faxineiro(String nome,int idade, double salario, String sexo, String setor) {
        super(nome,idade, sexo);
        this.setor = setor;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
      public void mostrar(){
        System.out.println("Informações do funcionário:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Setor: " + getSetor());
        
    }

}
