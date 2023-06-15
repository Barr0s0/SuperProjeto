package projetopoo;

public class Gerente extends Funcionario{
    private String departamento;
    private double salario;

    public Gerente(String nome, int idade, String sexo, String departamento) {
        super(nome, idade, sexo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

}

