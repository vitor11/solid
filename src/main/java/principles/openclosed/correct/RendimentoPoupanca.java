package principles.openclosed.correct;

public class RendimentoPoupanca implements RendimentoService {

    private static final double TAXA_POUPANCA = 0.00;

    @Override
    public double calcularRendimento(double valor) {
        return (valor * (TAXA_POUPANCA / 100));
    }
}
