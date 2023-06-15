package projetopoo;

public class Motorista extends Funcionario{
     private String veiculo;
     private double salario;

    public Motorista(String nome, int idade, String sexo,double salario, String veiculo) {
        super(nome, idade, sexo);
        this.veiculo = veiculo;
        this.salario = salario;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void apresentarInformacoes(){
        System.out.println("Informações do funcionário:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Salário: " + getSalario());
        System.out.println("Veiculo: " + getVeiculo());
    }
    
}
