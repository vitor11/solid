package principles.openclosed.correct;

public class RendimentoContaCorrente implements RendimentoService {

    private static final double TAXA_CONTA_CORRENTE = 10.00;

    @Override
    public double calcularRendimento(double valor) {
        return (valor * (TAXA_CONTA_CORRENTE / 100));
    }
}
