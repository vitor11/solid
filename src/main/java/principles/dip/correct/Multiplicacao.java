package principles.dip.correct;

public class Multiplicacao implements CalduladoraOperacoes{

    @Override
    public double calcular(double numbA, double numB) {
        return (numbA * numB);
    }
}
