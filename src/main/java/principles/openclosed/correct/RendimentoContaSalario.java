package principles.openclosed.correct;

public class RendimentoContaSalario implements RendimentoService {

    private static final double TAXA_CONTA_SALARIO = 15.00;

    @Override
    public double calcularRendimento(double valor) {
        return (valor * (TAXA_CONTA_SALARIO / 100));
    }
}
