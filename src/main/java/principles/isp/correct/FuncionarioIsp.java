package principles.isp.correct;

public abstract class FuncionarioIsp implements Convencional{

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }
}
